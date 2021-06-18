package com.tinyiko;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world this is my first java 101 program");
        //variables PRIMITIVE DATA TPYES
        byte byteVariable = -128; //-128 to 127 size 1 byte
        short shortVariable = 32767; //-32768 to 32767 size 2 bytes
        int intVariable = 2_147_483_647; //-2147483648 to 2147483647 size is 4 bytes
        long longVariable = 922_337_203_654_775_808L; // -922337203654775808 to 922337203654775808 size is 8 bytes
        float floatVariable= 1; // size is 4 bytes
        double doubleVariable = 10.00; //size is 8 bytes
        boolean booleanVariable = true; //true or false size is 1 bit
        char cahrVariable = 'A'; //size is 2 bytes


        System.out.println("byteVariable " + byteVariable);
        System.out.println("shortVariable " + shortVariable);
        System.out.println("intVariable " + intVariable);
        System.out.println("longVariable " + longVariable);
        System.out.println("floatVariable " + floatVariable);
        System.out.println("doubleVariable " + doubleVariable);
        System.out.println("booleanVariable " + booleanVariable);
        System.out.println("cahrVariable " + cahrVariable);


        //Object referance variable example

        int a = 10;
        int b = a;

        a = 100; // b's value won't be changed because both a and b resides in their own memory address

        Person johnsName = new Person("John");
        Person amandasName = johnsName;

        System.out.println("before changing John's name");
        System.out.println("John's name is " + johnsName.name + " and Amanda's name is "+ amandasName.name);

        //johnsName.name = "Johnny";

        amandasName.name = "Amandie";

        System.out.println("after changing John's or Amanda's name");
        System.out.println("John's name is " + johnsName.name + " and Amanda's name is "+ amandasName.name);


    }

    static class Person{

        //referace type or Objects
        String name;

        Person(String name){
            this.name = name;
        }
    }
}
