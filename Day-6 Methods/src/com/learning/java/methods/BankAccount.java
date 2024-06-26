package com.learning.java.methods;

public class BankAccount {
    //instance Variables
    String accNo;
    String accHolderName;
    double balance;

    double deposit ( double amount){
        balance += amount;
        return balance;
    }

    void withdraw (double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            //System.out.println("Withdraw Successful!" +balance);
        } else {
            System.out.println("Insufficient funds!");
        }

    }

    void displayInfo(){
        System.out.println("Account number : " + accNo);
        System.out.println("Account HolderName: " + accHolderName);
        System.out.println("Balace: " + balance);
    }
}