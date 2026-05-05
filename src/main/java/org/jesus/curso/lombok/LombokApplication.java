package org.jesus.curso.lombok;

import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.jesus.curso.lombok.files.FileManager;
import org.jesus.curso.lombok.model.*;
import org.jesus.curso.lombok.service.ConfigService;
import org.jesus.curso.lombok.service.Devs4jFileManager;
import org.jesus.curso.lombok.service.spring.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class LombokApplication {

    public static void valAndVar() {
        val username = "@raidentrance";

        var profileDescription = "Geek, developer and cool";

        log.info("Username {} of type {}", username, username.getClass().getName());
        log.info("Description {}, of type {}", profileDescription, profileDescription.getClass().getName());

        profileDescription = "Geek y me gustan las cervezas";
        log.info("Description {}, of type {}", profileDescription, profileDescription.getClass().getName());
    }

    public static void nonNullExample() {
        TwitterAccount account = new TwitterAccount(null);
        log.info("Account {}", account.getUsername());
    }

    public static void cleanupExample() {
        try {
            @Cleanup("releaseResources")
            Devs4jFileManager writer = new Devs4jFileManager();
            writer.write("Hola amigos de devs4j", "amigos.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getterAndSetterExample() {
        Person p = new Person();
        p.setAlive(true);
        p.setName("Juan");
        p.setLastName("Perez");

        log.info("Name {} LastName {} Alive {}", p.getName(), p.getLastName(), p.isAlive());
        p.foo();
    }

    public static void toStringExample() {
        User user = new User();
        user.setId(125);
        user.setUsername("raidentrance");
        user.setPassword("Hola123");
        user.setRole("ADMIN");
        log.info("User {}", user.toString());
    }

    public static void equalsAndHashcodeExample() {
        User user = new User();
        user.setId(125);
        user.setUsername("raidentrance");
        user.setPassword("Hola123434");
        user.setRole("USER");

        User user2 = new User();
        user2.setId(125);
        user2.setUsername("raidentrance");
        user2.setPassword("Hola");
        user2.setRole("ADMIN");

        log.info("Equals ? {}", user.equals(user2));
    }

    public static void equalsAndHashcodeExampleWithSuperExample() {
        UserEmployee user = new UserEmployee();
        user.setId(125);
        user.setUsername("raidentrance");
        user.setPassword("Hola123434");
        user.setRole("USER");
        user.setEmployeeId(10);
        user.setType(EmployeeType.EMPLOYEE);

        UserEmployee user2 = new UserEmployee();
        user2.setId(125);
        user2.setUsername("raidentrance");
        user2.setPassword("Hola");
        user2.setRole("ADMIN");
        user2.setEmployeeId(10);
        user2.setType(EmployeeType.VENDOR);
        log.info("Equals ? {}", user.equals(user2));
    }

    public static void constructorExample() {
        User user = new User(10, "raidentrance", "password", "ADMIN");
        User user2 = new User("Devs4j", "HolaAmigos");
        log.info("User {}", user.toString());
    }

    public static void dataExample() {
        Role role = new Role("ADMIN");
        role.setId(1020);
        role.setCreateTs(LocalDateTime.now());

        log.info("Role name {}", role.getName());
        log.info("Role hashcode {}", role.hashCode());
        log.info("Role full info {}", role.toString());
    }

    public static void valueExample() {
        Permission permission = new Permission(10, "CREATE_FILES", LocalDateTime.now());

        log.info("Permission name {}", permission.getName());
        log.info("Permission hashcode {}", permission.hashCode());
        log.info("Permission full info {}", permission.toString());
    }

    public static void basicBuilderExample() {
        Employee emp = Employee.builder().id(10).lastName("Agapito").age(34).nickName("raidentrance")
                .middleName(null).salary(100.0f).type(EmployeeType.EMPLOYEE)
                .address("Polanco")
                .address("Benito Juarez")
                .address("Xochimilco")
                .address("Miguel Hidalgo")
                .firstName("Alex").build();

        log.info("Full employee info {}", emp.toString());
    }

    public static void sneakyThrowsExample() {
        FileManager.createFiles("src/main/reso urces/test1.properties",
                "src/main/resources/test2.properties");
    }

    public static void withExample() {
        Point p = new Point(10.0f, 10.0f);

        Point p2 = p.withY(50.0f).withX(40.0f);

        log.info("{}", p.toString());
        log.info("{}", p2.toString());
    }

    public static void getLazyExample() {
        ConfigService cs = new ConfigService();
        String configuration = cs.getConfiguration();
        log.info("Config {}", configuration);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LombokApplication.class, args);
        HelloService bean = context.getBean(HelloService.class);
        bean.sayHello();
    }

}
