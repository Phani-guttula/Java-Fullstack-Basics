package com.conditional.java;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 15;
        int sum = 0;
         for (int i = 1; i <= num / 2; i++) {
             if (num % i == 0)
                 sum += i;
         }
    if (num == sum)
        System.out.println(num + ": is Perfect square.");
    else
        System.out.println(num + ": is Not Perfect square.");
    }
}
