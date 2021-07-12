package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        System.out.println("BREAK CONTINUE");


        String[] names = {"tinyiko", "senior", "chauke", "velaphi", "shadrack"};
        String[] lastNames = {"ngomani", "chabalala", "chauke", "smith", "vanberik"};

        for (String name : names) {
            if (name.contains("elaphi")) {
                System.out.println(name + " contains elaphi");
                break;
            }
            System.out.println(name);
        }

        for (String lastName : lastNames) {
            if (lastName.startsWith("c")){
                continue; // any lastName starting with "c" will be ignored
            }
            System.out.println(lastName); //any lastName starting with "c" wont be printed
        }

    }
}
