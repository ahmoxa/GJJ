package com.company.tasks4;


public class Task4 {
    public static void main(String[] args) {
        int k = 14;

        int dayNumber = k % 7;
        String dayType = (dayNumber == 6) || (dayNumber == 0) ?  "Weekend" : "Workday";
        System.out.println(dayType);
    }
}
