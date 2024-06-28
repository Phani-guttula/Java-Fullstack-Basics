package com.java.strings;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello Java";
        String str3 = "Phani";
        String str4 = "Guttula";
        String str5 = "Srinivasa Institute";

        System.out.println("\nComparision using (==) : " + (str1 == str2));
        System.out.println("Comparision using (equals()) : " + str1.equals(str2));
        System.out.println("Comparision using compareTo() : " + str3.compareTo(str2));
    //Concatination in Java
        System.out.println("\n"+ str3 + " " + str4);   //using + operator
        System.out.println(str3.concat(str4));  //using concat() method
    //Substring inn java
        System.out.println("\nSubString using beg. index value : " + str5.substring(10));
        System.out.println("SubString using beg&end index values : "+ str5.substring(3,8));
    //String methods
        System.out.println("\nLength of the string : " + str5.length());
        System.out.println("Finding character in the string  : "+ str5.charAt(12));
        System.out.println("Convert all letters to Capital : "+ str3.toUpperCase());
        System.out.println("Convert all letters to small : "+ str3.toLowerCase());
        System.out.println("Trim : "+ str5.trim());
        System.out.println("Finding index : "+ str5.indexOf("Institute"));
        System.out.println("Int value : "+ str5.valueOf(2));
        System.out.println("Replace the string : "+ str5.replace("Institute","College"));
        System.out.println("Splitting : ");
        String[] parts = str5.split(",");
        for (String part : parts)
            System.out.println(part);
    }
}
