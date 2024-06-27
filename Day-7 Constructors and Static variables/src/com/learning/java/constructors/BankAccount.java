package com.learning.java.constructors;

public class BankAccount {
    //static variables
    static String bankName = "State Bamk of India";

    //instance variables
    String accNo;
    double balance;

    BankAccount(){
        this.accNo = "Unknown";
        this.balance = 0.0;
    }

    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    //static method
    static String getBankName(){
        return BankAccount.bankName;
    }
}