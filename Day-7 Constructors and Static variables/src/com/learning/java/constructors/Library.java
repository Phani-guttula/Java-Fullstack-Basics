package com.learning.java.constructors;

public class Library {
    //Static Variables
    static String libraryName = "Central Library";

    //instance variables
    String bookTitle;
    String author;

    Library(){
        this.bookTitle = "Unknown";
        this.author = "Unknown";
    }
    Library (String bookTitle, String author){
        this.bookTitle = "CyberSecurity";
        this.author = "Hacker";
    }
    void displayBookInfo(){
        System.out.println("Library Name : "+ Library.libraryName);
        System.out.println("Book Titile : "+ bookTitle);
        System.out.println("Author : "+ author);
    }
}
