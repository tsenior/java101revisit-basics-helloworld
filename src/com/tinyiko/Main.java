package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        System.out.println("IF statements");

        //check if someone is an adult or nor
        //An adult is anyone over the age of 18

        int age = 19;

        if (age >= 18){
            System.out.println("you are old enough");
        }else if (age >= 16 && age < 18){
            System.out.println("am almost an adult");
        }else {
            System.out.println("go home kid");
        }


        //Ternary operator

        String message = age >= 18 ? "you are old enough" :
                "go home kid";

        System.out.println("message is: "+ message);
    }
}
