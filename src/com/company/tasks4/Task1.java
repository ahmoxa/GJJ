package com.company.tasks4;


public class Task1 {
    public static void main(String[] args) {
        int todayM = 12;
        int todayY = 2014;

        int bdM = 6;
        int bdY = 1985;

        int result = todayY - bdY;
        if(bdM > todayM) result--;
        System.out.println(result);
    }
}
