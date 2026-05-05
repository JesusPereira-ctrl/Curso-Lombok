package org.jesus.curso.lombok.model;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
public class Role {

    @ToString.Exclude
    private Integer id;

    @NonNull
    private String name;

    private LocalDateTime lastUpdateTs;

    private LocalDateTime createTs;
}
