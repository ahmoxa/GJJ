package com.company.tasks3;


public class Task3 {
    public static void main(String[] args) {
        //n
        double a = 1;
        double b = 1;
        double result = 2 * Math.sin((a + b)/2) * Math.cos((a - b)/2);

        //o
        double x = 1;
        result = Math.abs(2 * Math.sin(-3 * Math.abs(x/2)));
    }
}
