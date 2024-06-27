package com.javaarrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] noS = new int[5];  //array declaration
        //array initialization by using for loop
        for(int i = 0; i < noS.length; i++){
            noS[i] = i+1;
        }
        //printing the values
        for (int j : noS){
            System.out.println(j);
        }
        System.out.println(" ");
        System.out.println(noS[2]); // we can directly access by index value.

    }
}