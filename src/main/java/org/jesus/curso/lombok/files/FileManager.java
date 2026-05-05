package org.jesus.curso.lombok.files;

import lombok.SneakyThrows;

import java.io.File;

public class FileManager {

    public static void createFiles(String... files) {
        for (String file : files) {
            createFile(file);
        }
    }

    @SneakyThrows
    public static void createFile(String file) {
        File f = new File(file);
        f.createNewFile();
    }
}
