package com.conditional.java;
//Task: Write a program that assigns grades based on a student's score

public class GradeAssignment {
    public static void main(String[] args) {
        int score = 15;
        if(score >= 90)
            System.out.println("Grade A");
        else if(score >= 80 && score<=89)
            System.out.println("Grade B");
        else if(score >=70 && score  <=79)
            System.out.println("Grade C");
        else if(score >=60 && score <=69)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
}
