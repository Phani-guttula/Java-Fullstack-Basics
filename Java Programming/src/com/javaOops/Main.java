package com.javaOops;

public class Main {
    public static void main(String[] args) {
        //we should create an  object to call customer class
        //Syntax: Classname Obj-name = new Classname();
        Customer customer; // reference variable
        customer = new Customer();

        customer.id = 517;
        customer.name = "Phani";
        customer.email = "517@gmail.com";
        customer.age = 60;
        customer.phoneNo = "6305441192";
        customer.salary = 50000;
        customer.displayCustomerDetails(); //method calling
        customer.displayProducts("Diamond");
        System.out.println("Hurray☺ " +customer.name + " got " +customer.discoutPercentageByage() +"% discount.");
        System.out.println("Total Price $: "+ customer.finalPriceAfterDiscount(30000));
        System.out.println("  ");

        Customer customer1;  //new Object  customer1 is created
        customer1 = new Customer();
        customer1.id = 516;
        customer1.name = "Sindhu";
        customer1.age = 22;
        customer1.email = "516@gmail.com";
        customer1.phoneNo = "1234567890";
        customer1.salary = 50000;
        customer1.displayCustomerDetails();
        customer1.displayProducts("Gold");
        System.out.println("Hurray☺ " +customer1.name + " got " +customer.discoutPercentageByage() +"% discount.");
        System.out.println("Total Price $: "+ customer1.finalPriceAfterDiscount(50000));

    // Now we will create an Obj for com.learning.java.ConstructorTest class
        ConstructorTest constructorTest1;
        constructorTest1 = new ConstructorTest();   //by deault constructor called automatically when obj created.

        ConstructorTest constructorTest2;   // new object created to call parametered constructor
        constructorTest2 = new ConstructorTest(101, "Phaneendra", "phani@gmail.com", "1234567890", (byte)21, 70000);
        constructorTest2.displayCustomerDetails();      //this method called by using Inheritence
        System.out.println(" ");

        ConstructorTest constructorTest3;
        constructorTest3 = new ConstructorTest(202, "Ramesh", "ramesh@gmail.com", "88974361166", (byte)25, 45000);
        constructorTest3.displayCustomerDetails();
        System.out.println(" ");

    //Static method calling
        Customer.displayCompanyDetails();



    }
}
