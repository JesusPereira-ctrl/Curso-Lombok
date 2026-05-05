package org.jesus.curso.lombok.model;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Permission {

    private int id;

    private String name;

    private LocalDateTime createTs;
}
