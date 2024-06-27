package com.learning.java.constructors;

public class MainClass_Library {
    public static void main(String[] args) {
        Library library;
        library = new Library(); //default constructor
        library = new Library("CyberSecurity", "Hacker"); //parameterized constructors
        library.displayBookInfo(); // to display the info.
    }
}
