package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        int originalValue = 10;

        System.out.println("original value before :"+originalValue);
        incrementValue(originalValue);
        System.out.println("original value after:"+originalValue);



        int[] originalValues = {10, 20, 30};
        System.out.println("original value before :"+originalValues[0]);
        incrementValues(originalValues);
        System.out.println("original value after:"+originalValues[0]);
    }
    public static void incrementValue(int value){
        value += 1;
        System.out.println("value after incremented by 1 :"+value );

    }

    public static void incrementValues(int[] values){
        values[0] += 1;
        System.out.println("value after incremented by 1 :"+values[0] );

    }
}
