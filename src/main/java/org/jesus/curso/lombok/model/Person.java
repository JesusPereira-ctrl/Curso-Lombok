package org.jesus.curso.lombok.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private boolean alive;

    @Getter(value = AccessLevel.PRIVATE)
    @Setter(value = AccessLevel.PRIVATE)
    private String nickname;

    private static final Logger log = LoggerFactory.getLogger(Person.class);

    public void foo() {
        setNickname("raidentrance");
        String nickname = getNickname();
        log.info("Nickname {}", nickname);
    }
}
