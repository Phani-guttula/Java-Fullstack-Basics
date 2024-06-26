package com.learning.java.methods;

public class MainClass_Car {
    public static void main(String[] args) {
        Car car;
        car = new Car();// instance of the cls
        car.brand = "Lamborghini";
        car.model = "alpha 6S";
        car.year = 2024;
        car.price = 6000000;
        car.displayInfo();
    }
}
