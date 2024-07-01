package com.learning.java.arrays;

/*Write a java program to print the largest and smallest
element in an Unsorted Array */

public class SmallestOrLargest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i])
                smallest = array[i];
            if (largest < array[i])
                largest = array[i];
        }
        System.out.println("Smallest Number : " +smallest);
        System.out.println("Largest Number : " + largest);
    }

}

