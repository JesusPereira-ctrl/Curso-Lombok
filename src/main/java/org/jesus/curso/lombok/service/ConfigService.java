package org.jesus.curso.lombok.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigService {

    @Getter(lazy = true)
    private final String configuration = getConfigurationFromRemoteSource();

    private String getConfigurationFromRemoteSource() {
        log.info("Getting configuration");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Configuration calculated");
        return "Configuration from remote source";
    }
}
