package com.tinyiko;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        System.out.println("ARRAYS");

        System.out.println("Numbers");
        int [] numbers = {10, 2, 100};
        int lastValue = numbers[numbers.length-1];
        System.out.println("laast value "+ lastValue);
        System.out.println("we have "+ numbers.length + " items in the array");
        System.out.println(Arrays.toString(numbers));

        System.out.println("String Array");

        String [] stringsArray = {"abc", "def", "ghi", "jkl"};
        System.out.println("we have "+ stringsArray.length + " items in the array");
        System.out.println(Arrays.toString(stringsArray));
    }
}
