package com.kamaljot;

public class Main {

    public static void main(String[] args) {
        //list of various primitive data types
        //int
        //short
        //byte
        //long
        //float
        //char
        //boolean
        //double

        String a="This is a string";
        System.out.println(a);


        a=a+", \u00A9 2015 and this is more";
        System.out.println(a);


        String c="550.55";
        c=c+"49.55";
        System.out.println(c);


        String last = "10";
        int mal=50;
        last = last + mal;
        System.out.println(last);
        double dou = 525253.2555d;
        last = last + dou;
        System.out.println(last);
    }
}
