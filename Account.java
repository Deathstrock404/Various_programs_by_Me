package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;

public class Account
{

    private int account_number;
    private double balance;
    private String customer_name;
    private String email_id;
    private String phone_no;
    private double withdrawAmount;
    private double depositAmount;

    public double deposit(){
      return  balance += depositAmount;
    }

    public double withdraw()
    {
        if(balance >= withdrawAmount){
            return balance -= withdrawAmount;
        }
        else {
            System.out.println("due to the balance is less then the withdraw amount the transaction has been declined");
           return  balance = balance;
        }
    }
    public double getWithdrawAmount() {
        return withdraw();
    }

    public void setWithdrawAmount(float withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return deposit();
    }

    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
    public double getBalance() {
        return this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
