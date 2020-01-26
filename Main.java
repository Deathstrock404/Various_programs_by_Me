package com.kamaljot;

public class Main {

    public static void main(String[] args) {

        int Quantity_of_the_eggs = 1342;
        System.out.println("the total no of the eggs present with the user is " + Quantity_of_the_eggs);
        int gross = Quantity_of_the_eggs/144;
        System.out.println("Gross is equal to " + gross);
        int temp = Quantity_of_the_eggs % 144;
        // this is used to store value of the reminder but we don't want to display the value of the remainder
        int Dozen = temp/12;
        System.out.println("the no of dozen " + Dozen);
        int Remaining = temp % 12;
        System.out.println("the no of remaining eggs is " + Remaining);
    }
}
