package com.java.strings;

public class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1.concat( " World.");
        System.out.println(str1);
        str1 = str1.concat(" Java!");
        System.out.println(str1);

    }
}
