package com.tinyiko;

import com.tinyiko.model.ClothingItem;
import com.tinyiko.model.ClothingSize;
import com.tinyiko.model.Hat;
import com.tinyiko.model.Shirt;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, ClothingItem> items = new HashMap<>();
        items.put("Shirt", new Shirt(
                ClothingSize.M,
                19.99,
                3));
        items.put("Hat", new Hat(
                ClothingSize.M,
                20.00,
                1));

        System.out.println("getting single item in a Map<String, ClothingItem>");
        var anItem = items.get("Shirt");
        displayItemDetails(anItem);

        System.out.println("getting multiple items in a Map<String, ClothingItem>");
        var keys = items.keySet();
          for (String key : keys){
              var item = items.get(key);
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
