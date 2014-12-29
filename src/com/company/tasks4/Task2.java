package com.company.tasks4;


public class Task2 {
    public static void main(String[] args) {
        //a
        int n = 1232;

        boolean result = ((n % 10) & 1) == 1 ? false : true;
        System.out.println("Last numeral is even " + result);

        //b
        n = 1232;

        result = ((n % 10) & 1) == 1 ? true : false;
        System.out.println("Last numeral isn't even " + result);
    }
}
