package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");

        String a = null;
        String b = "";

        try {
            b.substring(1);
            a.substring(1);
        } catch (NullPointerException e) {
            System.out.println("null pointer "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("null pointer "+e.getMessage());
        }catch (Exception e){
            System.out.println("null pointer "+e.getMessage());
        }

    }
}
