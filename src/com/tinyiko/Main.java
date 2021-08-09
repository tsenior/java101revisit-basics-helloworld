package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        var stringTemplate = "Clothing item: %s, size %s, color %s, R%.2f";
        var itemString = String.format(stringTemplate, item,
                size, color, price);

        System.out.println(itemString);
    }
}
