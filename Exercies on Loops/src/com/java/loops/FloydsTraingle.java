package com.java.loops;

public class FloydsTraingle {
    public static void main(String[] args) {
        int n = 1;

        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print(n + " ");
                n++; // Increment n 
            }
            System.out.println();
        }
    }
}
