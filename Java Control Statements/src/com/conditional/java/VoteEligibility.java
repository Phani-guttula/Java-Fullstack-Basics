package com.conditional.java;
/*
Task: Write a program that checks if a person is eligible to vote. The eligible age for voting
is 18 years or older.
 */

public class VoteEligibility {
    public static void main(String[] args) {
        int age = 14;

        if(age >= 18)
            System.out.println("You are Eligible to Vote.");
        else
            System.out.println("You are Not Eligible to Vote.");
    }

}
