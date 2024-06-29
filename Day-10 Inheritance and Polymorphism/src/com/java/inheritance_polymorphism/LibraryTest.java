package com.java.inheritance_polymorphism;

class Book {
    //instance variables
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        //System.out.println("Book details:");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends Book {
    //instance variable
    double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    void displayFileSize() {
        System.out.println("File Size of the Ebook : " + fileSize + "MB");
    }
}

class PrintedBook extends Book {
    //instance variables
    int numPages;

    public PrintedBook(String title, String author, int numPages) {
        super(title, author);
        this.numPages = numPages;
    }

    void displayNumPages() {
        System.out.println("Number of Pages : " + numPages);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        EBook eBook = new EBook("Red Notice", "Lokesh", 20);
        PrintedBook printedBook = new PrintedBook("Hello Java", "James Gosling", 1024);

        System.out.println("EBook details : ");
        eBook.displayInfo();
        eBook.displayFileSize();

        System.out.println("\nPrinted Book details ;");
        printedBook.displayInfo();
        printedBook.displayNumPages();

    }
}
