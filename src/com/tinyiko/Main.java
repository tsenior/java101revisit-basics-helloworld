package com.tinyiko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        var sc = new Scanner(System.in);

        double d1 = getInput(sc, "Enter value 1: ");
        double d2 = getInput(sc, "Enter value 2: ");

        System.out.println(d1 + " divided by "+ d2 +" equals :"+(d1 / d2));
    }

    private static double getInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }
}
