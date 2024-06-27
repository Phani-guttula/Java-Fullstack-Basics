package com.javaarrays;

public class ArrayOfObjects {
    String name;
    int age;

    ArrayOfObjects(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ArrayOfObjects[] obj1 = new ArrayOfObjects[2];
        obj1[0] = new ArrayOfObjects("Phani",20);
        obj1[1] = new ArrayOfObjects("sindhu", 21);

        System.out.println(obj1[0].name);
        System.out.println(obj1[0].age);
    }
}
