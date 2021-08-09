package com.tinyiko;

import com.tinyiko.model.ClothingItem;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var item = new ClothingItem(ClothingItem.SHIRT, "M", 19.99, 3);

        var totalCost = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var slip = String.format("Your %s order will cost %s",
                item.getType(), formatter.format(totalCost));

        System.out.println(slip);
    }
}
