package com.learning.java.arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        printArray(array); // static dont need object

        // Reverse the array
        reverse(array);

        // Print the reversed array
        System.out.println("Reversed array:");
        printArray(array);
    }

    // Method to reverse the array
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the start index forward and end index backward
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
