package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        int originalValue = 10;

        System.out.println("original value before :"+originalValue);
        incrementValue(originalValue);
        System.out.println("original value after:"+originalValue);



    }
    public static void incrementValue(int value){
        value += 1;
        System.out.println("value after incremented by 1 :"+value );

    }
}
