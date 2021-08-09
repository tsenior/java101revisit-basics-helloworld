package com.tinyiko;

import com.tinyiko.config.CalcHelper;
import com.tinyiko.config.GetInputHelper;
import com.tinyiko.config.MethodsOverloadsHelper;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        Logger logger = Logger.getLogger(String.valueOf(Math.class));

        var sc = new Scanner(System.in);

        double d1 = GetInputHelper.getInput(sc, "Enter value 1: ");
        double d2 = GetInputHelper.getInput(sc, "Enter value 2: ");

        System.out.println("select operation (+ - * /)");
        var operation = sc.nextLine();
        double result;

        switch (operation){
            case "+":
                result = CalcHelper.addValues(d1,d2);
                break;

            case "-":
                result = CalcHelper.subtractValues(d1,d2);
                break;

            case "*":
                result = CalcHelper.multipleValues(d1,d2);
                break;

            case "/":
                result =  CalcHelper.divideValues(d1,d2);
                break;

            default:
                System.out.println("you did not choose a correct operation");
                return;
        }

        System.out.println("The answer is "+ result);

        var addedPlusSumValues  = MethodsOverloadsHelper.getAddedPlusSumValues(d1,d2,d1);
        logger.info("three arguments :" + addedPlusSumValues);

        var addedmultipleValues = MethodsOverloadsHelper.getAddedPlusSumValues(d1, d2,d1, d2,d1, d2);
        logger.info("multiple arguments" + addedmultipleValues);

    }

}
