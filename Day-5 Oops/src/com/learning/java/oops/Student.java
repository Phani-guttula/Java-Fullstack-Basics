package com.learning.java.oops;

// Student management system
public class Student {
    // instance variables
    String name;
    int id;
    int age;
    String mobileNo;
    String location;

    public static void main(String[] args) {
        Student s1 = new Student(); // object 1
        s1.name = "Phani";
        s1.id = 111;
        s1.age = 20;
        s1.mobileNo = "+91 1231231230";
        s1.location = "Ravulapalem";
        //Display student details
        System.out.println("Student 1");
        System.out.println("Name: "+ s1.name);
        System.out.println("Id: "+ s1.id);
        System.out.println("Age: "+ s1.age);
        System.out.println("MobileNo: "+ s1.mobileNo);
        System.out.println("Location: "+ s1.location);
        System.out.println(" ");

        Student s2 = new Student(); // object 2
        s2.name = "Sindhu";
        s2.id = 222;
        s2.age = 21;
        s2.mobileNo = "+91 4564564560";
        s2.location = "Kothapeta";
        //Display student details
        System.out.println("Student 2");
        System.out.println("Name: "+ s2.name);
        System.out.println("Id: "+ s2.id);
        System.out.println("Age: "+ s2.age);
        System.out.println("MobileNo: "+ s2.mobileNo);
        System.out.println("Location: "+ s2.location);
        System.out.println(" ");

        Student s3 = new Student(); // object 3
        s3.name = "Arjun";
        s3.id = 333;
        s3.age = 22;
        s3.mobileNo = "+91 7897897890";
        s3.location = "Amalapuram";
        //Display student details
        System.out.println("Student 3");
        System.out.println("Name: "+ s3.name);
        System.out.println("Id: "+ s3.id);
        System.out.println("Age: "+ s3.age);
        System.out.println("MobileNo: "+ s3.mobileNo);
        System.out.println("Location: "+ s3.location);
        System.out.println(" ");

}
}
