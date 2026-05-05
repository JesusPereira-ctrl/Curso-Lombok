package org.jesus.curso.lombok.service.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final PrintService service;

    private String prefix = "HELLO MESSAGE";

    public void sayHello() {
        service.printMessage(String.format("%s - %s", prefix, "Hello from Hello service"));
    }
}
