package com.tinyiko;

import com.tinyiko.model.ClothingItem;
import com.tinyiko.model.ClothingSize;
import com.tinyiko.model.Hat;
import com.tinyiko.model.Shirt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<ClothingItem> items = new ArrayList<>();
        items.add(
                new Shirt(
                    ClothingSize.M,
                    19.99,
                    3));
        items.add(
                new Hat(
                        ClothingSize.M,
                        20.00,
                        1));

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
