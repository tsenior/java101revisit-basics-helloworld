package com.tinyiko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        var sc = new Scanner(System.in);

        double d1 = getInput(sc, "Enter value 1: ");
        double d2 = getInput(sc, "Enter value 2: ");

        System.out.println(d1 + " divided by "+ d2 +" equals :"+(d1 / d2));


        var sum = getAddedValues(d1, d2);
        System.out.println("sum is :"+sum);

        var addedPlusSumValues  = getAddedPlusSumValues(d1,d2,sum);
        System.out.println("sum value added with first two values :"+addedPlusSumValues);

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
        System.out.println(prompt);
        return sc.nextDouble();
    }
}
