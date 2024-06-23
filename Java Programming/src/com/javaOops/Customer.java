package com.javaOops;

public class Customer {
        /*
        Initialize the variables
        these are called instance variables
        these variables are stored in Heap memory By default these variables values are 0 or Null
         */
        int id;
        String name;
        String email;
        String phoneNo;
        byte age;
        int salary;

        final static  String COMPANY_NAME = "Training Mug Pvt Ltd"; // static variables can access all Objects
        static String location = "Hyderabad";
        static String contactNo = "044-232426";

        /* Methods have behaviour of the code
        method types- 4
         */
        //1. No Returntype and No Parameters
        void displayCustomerDetails () {      // use Camel case to declare methods
            System.out.println("Id: " + id);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("E-mail: " + email);
            System.out.println("Phone-no: " + phoneNo);
            System.out.println("Salary: " + salary);
            System.out.println("Working in: " +Customer.COMPANY_NAME);

        }
        //2. No Returntype and with Parameters
        void displayProducts(String membership){
            System.out.println("Products list for " + membership +" user.");
            System.out.println("Mobiles\nCars\nBikes\nClothes\nShopping Completed");
        }
        //3. with Returntype and No Parameters
        byte discoutPercentageByage(){
            byte discountPercentage = 0;
            System.out.println("Discount % Calculating");
            if(age >= 60){
                discountPercentage = 50;
            } else if (age >=40 && age < 60) {
                discountPercentage = 30;
            }else if (age >=20 && age < 40){
                discountPercentage = 20;
            }else{
                discountPercentage = 5;
            }
            return discountPercentage;
        }
        //4. with Returntype and with Parameters
        /*
        we will find Final price after discount
        we want-->product price (it is the parameter)
                  discountpercentage
                  total price= product price -(product price -discountPercentage)/100
        now return total price
         */
        double finalPriceAfterDiscount(int productPrice){
            double totalPrice = productPrice - (productPrice * discoutPercentageByage())/100;
            return  totalPrice;
        }

    //Static methods
        static void displayCompanyDetails(){
            System.out.println("Company Name: " + COMPANY_NAME);
            System.out.println("Address: " + location);
            System.out.println("Contact No: " + contactNo);
        }



    }



