package com.tinyiko.config;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class GetInputHelper {
    private GetInputHelper() {
    }

    public static double getInput(Scanner sc, String prompt) {
        Logger logger = Logger.getLogger("");
        double dvalue = 0;


        try {
            System.out.println(prompt);
            dvalue = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            logger.severe("could not format the number correctly");
        }

        return dvalue;
    }
}
