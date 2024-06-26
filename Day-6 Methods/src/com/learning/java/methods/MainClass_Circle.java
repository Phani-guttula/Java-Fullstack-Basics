package com.learning.java.methods;

public class MainClass_Circle {
    public static void main(String[] args) {
        Circle circle;
        circle = new Circle();
        circle.radius = 2;
        circle.color = "Red";

        /* here we are already called these methods in displayInfo method
        so we dont need to call again */
       // circle.getArea(5.2);
        //circle.getCircumference(5.2);

        circle.displayInfo();
    }
}
