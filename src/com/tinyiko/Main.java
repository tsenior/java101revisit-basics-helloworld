package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        String name1 = new String("Tinyiko1");

        String name2 = "Tinyiko2";


        System.out.println("name1 " +name1+" name2 " +name2);
        System.out.println("uppercase names name1 " + name1.toUpperCase()+ " name2 " +name2.toUpperCase());
        System.out.println("the last characters of name1 is "+ name1.charAt(name1.length()-1) + " and for name2 is "+ name2.charAt(name2.length()-1));
        System.out.println("check if name1 contains ko1 characters "+ name1.contains("ko1"));
        System.out.println("check if name2 contains ko2 characters "+ name2.contains("ko2"));
    }
}
