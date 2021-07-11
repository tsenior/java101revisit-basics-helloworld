package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        System.out.println("LOGICAL OPERATORS");

        boolean isAdultAndOperator = true;
        boolean isTeenagerAndOperator = true;

        //And Operator(&&) all conditions must be true for it to evelaute to true

        System.out.println("it will evalaute to true is all conditions are true, else it will be false");
        System.out.println(isAdultAndOperator && isTeenagerAndOperator);



        //OR(||) all conditions must be true for it to evelaute to true
        boolean isAdultOrOperator = true;
        boolean isTeenagerOrOperator = false;

        System.out.println("it will evalaute to true is one conditions is true, else it will be false");
        System.out.println(isAdultOrOperator || isTeenagerOrOperator);

        //NOR(!) flips the value of OR and NOT operators. it will result in the opposite of each

        System.out.println(!isAdultOrOperator);
        System.out.println(!isTeenagerOrOperator);
    }
}
