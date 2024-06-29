package com.inheritance;

class Product{
    void displayInfo(){
        System.out.println("Parent Class :");
        System.out.println("Products section.");
    }
}
class Mobile extends Product{
    void display(){
        System.out.println("Child Class :");
        System.out.println("Mobiles section");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.displayInfo();   //Calling Parent class method
        mobile.display();   //Calling child class method
    }
}
