package com.tinyiko;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        var sc = new Scanner(System.in);

        double d1 = getInput(sc, "Enter value 1: ");
        double d2 = getInput(sc, "Enter value 2: ");

        System.out.println("select operation (+ - * /)");
        var operation = sc.nextLine();
        double result;

        switch (operation){
            case "+":
                result = d1 + d2;
                break;

            case "-":
                result = d1 - d2;
                break;

            case "*":
                result = d1 * d2;
                break;

            case "/":
                result = d1 / d2;
                break;

            default:
                System.out.println("you did not choose a correct operation");
                return;
        }
        System.out.println("The answer is "+ result);


        var sum = getAddedValues(d1, d2);

        var addedPlusSumValues  = getAddedPlusSumValues(d1,d2,sum);
        System.out.println("sum value added with first two values * 2 :"+addedPlusSumValues);

        var multipleValues = getAddedPlusSumValues(d1, d2,d1, d2,d1, d2);
        System.out.println("multipleValues" + multipleValues);


    }

    private static double getAddedValues(double d1, double d2) {
        return d1 + d2;
    }
    private static double getAddedPlusSumValues(double d1, double d2, double sum) {
        return (d1 + d2) + sum;
    }

    private static double getAddedPlusSumValues(double... values) {
        double result = 0;

        for (var value : values){
            result += value;
        }
        return result;
    }

    private static double getInput(Scanner sc, String prompt) {
        double dvalue = 0;
        try {
            System.out.println(prompt);
            dvalue = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("could not format the number correctly");
        }

        return dvalue;
    }
}
