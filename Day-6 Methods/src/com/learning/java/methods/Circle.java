package com.learning.java.methods;

public class Circle {
    double radius;
    String color;

    double getArea(double radius) {
        return 3.14 * radius * radius;
    }

    double getCircumference(double radius){
        return 2 * 3.14 * radius;
        }

    void displayInfo(){
        System.out.println("Radius of the Circle : "+ radius);
        System.out.println("Color of the Circle : "+ color);
        System.out.println("Area of the Circle: "+ getArea(radius));
        System.out.println("Circumference of the Circle: "+ getCircumference(radius));
    }
}
