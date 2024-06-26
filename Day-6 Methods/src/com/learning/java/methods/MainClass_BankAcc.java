package com.learning.java.methods;

public class MainClass_BankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount;
        bankAccount = new BankAccount();

        bankAccount.accNo = "10002445";
        bankAccount.accHolderName = "Phaneendra";
        bankAccount.balance = 0;
        //bankAccount.displayInfo();

        bankAccount.deposit(8000);
        bankAccount.withdraw(5000);
        bankAccount.displayInfo();



    }
}
