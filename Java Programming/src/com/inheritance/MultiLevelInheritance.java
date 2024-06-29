package com.inheritance;

class One{
    int a = 10;
}

class Two extends One{
    int b = 20;
}

class  Three extends Two{
    int c = 30;
    int sum = a+b+c;

    void displaySum(){
        System.out.println("Sum : "+ sum);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Three three = new Three();
        three.displaySum();
    }
}
