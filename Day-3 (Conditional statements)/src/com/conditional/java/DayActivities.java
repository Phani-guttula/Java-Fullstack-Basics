package com.conditional.java;

/*Task: Write a program that suggests activities based on the day of the week*/

public class DayActivities {
    public static void main(String[] args) {
        int day = 5;


        switch (day) {
            case 1:
                System.out.println("Today is: Monday. \nActivity = Gym");
                break;
            case 2:
                System.out.println("Today is: Tuesday. \nActivity  = Yoga");
                break;
            case 3:
                System.out.println("Today is: Wednesday. \nActivity  = Swimming");
                break;
            case 4:
                System.out.println("Today is: Thursday. \nActivity  = Reading");
                break;
            case 5:
                System.out.println("Today is: Friday. \nActivity = Movies");
                break;
            case 6:
                System.out.println("Today is: Saturday. \nActivity = Hiking");
                break;
            case 7:
                System.out.println("Today is: Sunday. \nActivity = Rest");
                break;

        }

    }

}
