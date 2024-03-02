package com.training.demo;

/*
 * 02. Create a program that uses a switch statement to check the day of the week (1-7) entered by the user and print the corresponding day name.
 */
public class ControlStatement2 {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        String dayName = "";
        switch (day) {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Invalid day";
            break;
        }
        System.out.println(dayName);
    }

}
