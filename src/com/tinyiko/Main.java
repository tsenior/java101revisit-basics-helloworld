package com.tinyiko;

import com.sun.source.tree.WhileLoopTree;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        String[] months = {"janaury", "february", "march",
                           "april", "may", "june",
                           "july", "august", "september",
                           "october", "november", "december"};

        System.out.println("***********for i loop***********");
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("***********Dfor each loop***********");
        for (var month : months){
            System.out.println(month);
        }


        System.out.println("***********while loop***********");
        int whileCounter = 0;

        while (whileCounter < months.length){
            System.out.println(months[whileCounter]);
            whileCounter++;
        }

       System.out.println("***********Do while loop***********");
       int doCounter = 0;

       do{
            System.out.println(months[doCounter]);
            doCounter++;
        } while (doCounter < months.length);

    }
}
