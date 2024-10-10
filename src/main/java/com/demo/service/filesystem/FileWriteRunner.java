package com.demo.service.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("./resource/file-write.txt");

        List<String> list = List.of("Apple","Boy", "Cat", "Hello");

        Files.write(pathFileToRead, list);
    }
}