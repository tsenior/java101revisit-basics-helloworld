package com.tinyiko;

import com.tinyiko.model.ClothingItem;
import com.tinyiko.model.ClothingSize;
import com.tinyiko.model.Hat;
import com.tinyiko.model.Shirt;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Blue";
        colors[2] = "Green";


        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        ClothingItem[] items = {
                new Shirt(
                ClothingSize.M,
                19.99,
                3),

                new Hat(
                ClothingSize.M,
                20.00,
                1)
        };

      for (ClothingItem item : items){
          displayItemDetails(item);
      }


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
