package com.java.loops;

public class FibonocciSeries {
    public static void main(String[] args) {


        int limit = 1000;
        int firstValue = 0;
        int secondValue = 1;

        while (  firstValue < limit){
            System.out.println(secondValue + " ");

            int number = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = number;
        }
    }
}
