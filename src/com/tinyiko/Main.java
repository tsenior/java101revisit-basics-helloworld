package com.tinyiko;

import com.tinyiko.model.ClothingItem;
import com.tinyiko.model.ClothingSize;
import com.tinyiko.model.Hat;
import com.tinyiko.model.Shirt;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var shirtItem = new Shirt(
                ClothingSize.M,
                19.99,
                3);

        displayItemDetails(shirtItem);

        var hatItem = new Hat(
                ClothingSize.M,
                20.00,
                1);

        displayItemDetails(hatItem);
    }

    private static void displayItemDetails(ClothingItem item) {
        var totalCost = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var slip = String.format("Your %s size %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalCost));

        System.out.println(slip);
    }
}
