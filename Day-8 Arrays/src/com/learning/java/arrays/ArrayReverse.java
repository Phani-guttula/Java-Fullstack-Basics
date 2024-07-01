package com.learning.java.arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int n;
        n = array.length;

        for (int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
