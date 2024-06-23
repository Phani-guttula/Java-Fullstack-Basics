package com.basicsOfJava;

public class OperatorsInJava {
    public static void main(String[] args) {
        /*
    arithmetic operators --> + - * / %
    logical operators --> &&, ||, !
    relational operators --> < > <= >= == !=
    bitwise operators--> &, |, ~, ^

     */
        int a = 5;
        int b = 3;
        //Arithmeti Operators
        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a*b: " + (a*b));
        System.out.println("a/b: " + (a/b));
        System.out.println("a%b: " + (a%b));

        // Relational operators
        System.out.println("a<b: " + (a<b));
        System.out.println("a>b: " + (a>b));
        System.out.println("a<=b: " + (a<=b));
        System.out.println("a>=b: " + (a>=b));
        System.out.println("a==b: " + (a==b));
        System.out.println("a!=b: " + (a!=b));

        //Logical operators
        if(a <=10 && b >= 1){ // executes if both condi. are True.
            int c = a + b;
            System.out.println("a && b: " + c);
        }
         if(a <10 || b >10){  // executes if any one condi. True
             int d = a*b;
             System.out.println("a||b: " + d);
         }
        System.out.println("!(a<b): " + !(a<b));
        System.out.println("!(a>b): " + !(a>b));


    }

}
