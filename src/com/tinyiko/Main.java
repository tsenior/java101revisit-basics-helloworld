package com.tinyiko;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        System.out.println("user input scanner");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");

        String name = scanner.nextLine();
        System.out.println("Hello "+ name);

        System.out.println("enter your age");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("you were born in "+year);

        if (age < 18){
            System.out.println("you are old enough");
        }else {
            System.out.println("you are a child");
        }


    }
}
