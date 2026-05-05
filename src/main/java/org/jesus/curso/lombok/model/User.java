package org.jesus.curso.lombok.model;

import lombok.*;

@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    @Getter
    @Setter
    @ToString.Include
    private Integer id;

    @Getter
    @Setter
    @ToString.Include
    @NonNull
    private String username;

    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    @NonNull
    private String password;

    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private String role;
}
