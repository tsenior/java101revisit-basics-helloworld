package com.tinyiko;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));


        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Interger: " + intF.format(doubleValue));
        intF.setGroupingUsed(false);
        System.out.println("Interger with no separators: " + intF.format(doubleValue));

        var locale = Locale.getDefault();
        var localeformatter = NumberFormat.getNumberInstance(locale);
        System.out.println("default locale Number:"+ localeformatter.format(doubleValue));

        var specificLocale = new Locale("de", "DE");
        var specificlocaleformatter = NumberFormat.getNumberInstance(specificLocale);
        System.out.println("specific locale Number, using DUTCH as example:"+ specificlocaleformatter.format(doubleValue));

        var defaultCurF = NumberFormat.getCurrencyInstance();
        System.out.println("Default or SA Currency: " + defaultCurF.format(doubleValue));

        var curF = NumberFormat.getCurrencyInstance(specificLocale);
        System.out.println("German Currency: " + curF.format(doubleValue));

        var customDecimalFormat = new DecimalFormat("R0.00");
        System.out.println(customDecimalFormat.format(2));
        System.out.println(customDecimalFormat.format(22));
        System.out.println(customDecimalFormat.format(222));
        System.out.println(customDecimalFormat.format(20000));
    }
}
