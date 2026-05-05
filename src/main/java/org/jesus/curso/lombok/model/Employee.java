package org.jesus.curso.lombok.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String nickName;
    private int age;
    private float salary;
    private EmployeeType type;

    @Singular
    private List<String> addresses;

    @Builder.Default
    private LocalDateTime lastUpdateTs = LocalDateTime.now();

    @Builder.Default
    private LocalDateTime createTs = LocalDateTime.now();
}
