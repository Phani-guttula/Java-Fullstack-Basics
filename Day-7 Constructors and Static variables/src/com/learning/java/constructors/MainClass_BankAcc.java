package com.learning.java.constructors;

public class MainClass_BankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount;
        bankAccount = new BankAccount(); //default Constructor;
        bankAccount = new BankAccount("1001004025", 1000);

        System.out.println("Acccount Number : "+ bankAccount.accNo);
        System.out.println("Account balance : "+ bankAccount.balance);
        System.out.println("Bank Name : "+ BankAccount.getBankName());
    }
}
