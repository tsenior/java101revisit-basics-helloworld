package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        System.out.println("IF statements");

        //check if someone is an adult or nor
        //An adult is anyone over the age of 18

        int age = 15;

        if (age >= 18){
            System.out.println("you are old enough");
        }else if (age >= 16 && age < 18){
            System.out.println("am almost an adult");
        }else {
            System.out.println("go home kid");
        }
    }
}
