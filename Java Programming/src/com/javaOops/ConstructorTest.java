package com.javaOops;

public class ConstructorTest extends Customer {
    /* --Constructor-- are declared after variables & before methods
	 --Constructors are 2 types
	 1.default constructor
	 2. parameter constructor
	 3. no parameter constructor
	 */
 //1.Default Constructor
    ConstructorTest(){
        System.out.println("\nDefault Constructor Called...");
    }

 //2.parameter constructor.
    ConstructorTest(int id, String name, String email, String phoneNo, byte age, int salary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.age = age;
        this.salary = salary;
    }

}
