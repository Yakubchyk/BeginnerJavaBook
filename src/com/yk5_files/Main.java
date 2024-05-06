package com.yk5_files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newFile = "/Users/yakubchyk/IdeaProjects/BeginnerJavaBook/src/com/yk5_files/new_file.txt";

        File file = new File(newFile);

        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует.");
            }

            FileOutputStream fos = new FileOutputStream(file);
            System.out.println("Введите строку для заполнения файла: ");
            String content = scanner.nextLine();
            fos.write(content.getBytes());
            fos.close();
            System.out.println("Данные записаны в файл.");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
