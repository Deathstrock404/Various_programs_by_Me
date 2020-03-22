package com.company;

public class Main {

    public static void main(String[] args) {
        Account kamaljot = new Account();
        Account nitin = new Account();
        kamaljot.setAccount_number(1);
        kamaljot.setBalance(50000);
        kamaljot.setCustomer_name("kamaljot");
        kamaljot.setPhone_no("9588794589");
        kamaljot.setDepositAmount(200);
        kamaljot.setWithdrawAmount(450);


        nitin.setAccount_number(2);
        nitin.setBalance(10000);
        nitin.setCustomer_name("nitin");
        nitin.setPhone_no("8053883323");
        nitin.setDepositAmount(500);
        nitin.setWithdrawAmount(45020);


        System.out.println("the initial amount in kamaljot's account is " + kamaljot.getBalance());
        System.out.println("the amount in kamaljot's account after withdrawing is " + kamaljot.getWithdrawAmount());
        System.out.println("the amount in kamaljot's account after deposit is " + kamaljot.getDepositAmount());
        System.out.println("the net  balance after transaction in account of kamaljot is " + kamaljot.getBalance());

        System.out.println("the initial amount in nitin's account is " + nitin.getBalance());
        System.out.println("the amount in nitin's account after withdrawing is " + nitin.getWithdrawAmount());
        System.out.println("the amount in nitin's account after deposit is " + nitin.getDepositAmount());
        System.out.println("the net  balance after transaction in account of nitin is " + nitin.getBalance());
    }
}
