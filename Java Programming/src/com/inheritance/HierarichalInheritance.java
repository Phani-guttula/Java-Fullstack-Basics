package com.inheritance;

class Vehicle{
    void display(){
        System.out.println("Vehicles are available");
    }
}
class Car extends Vehicle{
    void display(){
        System.out.println("Cars Section.");
    }
}
class Bikes extends Vehicle{
    void display(){
        System.out.println("Bikes Section.");
    }
}
public class HierarichalInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Bikes();
        Vehicle vehicle1 = new Car();
        vehicle1.display();
        vehicle.display();


    }

}