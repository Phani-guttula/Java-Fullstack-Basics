package com.basicsOfJava;

public class Loops {
    public static void main(String[] args) {
        /*
        Loops in java
        while loop
        for loop
        do-while
         */
        int n = 1;
        int i;
        int j=1;


        //print even numbers by using ----While Loop---
        System.out.println("Printing Even Numbers - While loop");
        while(n <= 10) {
            if(n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
        System.out.println("Successful");



        //Print odd numbers by using --For Loop--
        System.out.println("\nPrinting Odd Numbers - For loop");
        for(i=1; i<=10; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("Successful");



        //Print Natural numbers by using --Do-While Loop--
        System.out.println("\nPrinting Natural Numbers - do-while");
        do {
            System.out.println(j);
            j++;
        }while(j <= 10);

        System.out.println("Successful");
    }
}
