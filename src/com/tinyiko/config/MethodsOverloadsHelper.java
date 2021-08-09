package com.tinyiko.config;

public class MethodsOverloadsHelper {

    public static double getAddedPlusSumValues(double d1, double d2, double d3) {
        return (d1 + d2) + d3;
    }

    public static double getAddedPlusSumValues(double... values) {
        double result = 0;

        for (var value : values){
            result += value;
        }
        return result;
    }
}
