package com.exmple.variables;

/*Write a program that demonstrates variable scope by declaring variables with the same
name in different scopes (local, instance, class), then accessing and displaying them.*/

public class VariableScope {

    //class variable
    static  int a = 10;

    void displayValues(){
        //Local variable
        int a = 20;
        System.out.println("Local Variable: "+ a);
        System.out.println("Class variable: "+ VariableScope.a);
    }

    public static void main(String[] args) {
        //Instance Variable
        int a = 30;
        VariableScope demo = new VariableScope();

        demo.displayValues();
        System.out.println("Instance Variable: "+ a);



    }
}
