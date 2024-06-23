package com.basicsOfJava;

public class ConditionalStatements {
    public static void main(String[] args) {
        /*
        if
        if else
        else-if
        switch
         */
        //If condition
        int a = 10;
        int b = 20;

        if(a > b){  // executes on if condition is True
            System.out.println("A is greater than B");
        }

        // If else
        if(a > b){
            System.out.println(" Its True A>B ");
        }else{
            System.out.println(" A is not Greater than B ");
        }

        //Else-if
        // based on the customer membership we will give discount on the products
		/*
		 membership Diamond=50%
		 Gold=30%
		 Silver=20%
		 others= 10%
		 */
        int productprice = 30000;
        int discount;
        int discountpercentage;
        char membership;
        membership = 'S';

        if(membership == 'D') {
            discountpercentage = 50;

        }else if(membership == 'G') {
            discountpercentage = 30;

        }else if(membership == 'S') {
            discountpercentage = 20;

        }else {
            discountpercentage = 10;

        }

        discount = productprice*discountpercentage / 100;
        System.out.println("Your membership is:"+membership + " u got "+discountpercentage +"% discount");
        System.out.println("Total Amount " + discount);
    }
}
