package org.jesus.curso.lombok.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Devs4jFileManager {

    private static final Logger log = LoggerFactory.getLogger(Devs4jFileManager.class);

    public void write(String text, String file) {
        log.info("Writing {} in {}", text, file);
    }
    
    public void releaseResources() throws IOException {
        log.info("Releasing resources");
    }
}
