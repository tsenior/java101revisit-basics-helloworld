package com.tinyiko;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        // Loops

        int[] numbers = {40, 1, 2, 3, 4, 5, 6 , 10, 20, 30};
        String[] names = {"tinyiko","senior","chauke"};

        System.out.println("NUMBERS FOR I ARRAY");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("reversed numbers loop");
        for (int i = numbers.length - 1; i >=0; i--){
            System.out.println(numbers[i]);
        }

        System.out.println("NUMBERS ENHANCED FOR LOOP");
        for (int number : numbers){
            System.out.println(number);
        }


        System.out.println("NAMES FOR I ARRAY");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("reversed names loop");
        for (int i = names.length -1; i >=0; i--){
            System.out.println(names[i]);
        }

        System.out.println("NAMES ENHANCED FOR LOOP");
        for (String name : names){
            System.out.println(name);
        }

        //looping by streaming
        System.out.println("LOOPING USING STREAM");

        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(numbers).forEachOrdered(System.out::println);


    }
}
