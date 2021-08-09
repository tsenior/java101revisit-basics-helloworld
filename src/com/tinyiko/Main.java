package com.tinyiko;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        var file = new File("hello.txt");
        if (!file.exists()) {
            System.out.println("file does not exist");
        }

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            var text = bufferedReader.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
