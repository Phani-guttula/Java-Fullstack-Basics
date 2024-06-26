package com.java.loops;

public class PatternPrinting {
    public static void main(String[] args) {
        int n = 6; // Number of rows (and max characters)

        int i;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) { //incresing the characters
                System.out.print((char) ('A' + j));
            }

            for (int k = 0; k < 2 * i; k++) { //for spaces
                System.out.print(" ");
            }

            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j)); //decreasing the characters
            }

            System.out.println(" ");//to print on the next line
        }

    }
}
