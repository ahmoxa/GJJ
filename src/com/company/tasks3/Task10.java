package com.company.tasks3;


public class Task10 {
    public static void main(String[] args) {
        //a
        int x = 1;
        int y = 3;

        boolean result = (x & 1) == 1 && (y & 1) == 1;
        System.out.println("Both numbers are not even " + result);

        //b
        x = 22;
        y = 22;
        result = ((x < 20) && (y >= 20)) || ((y < 20) && (x >= 20));
        System.out.println("Only one number less then 20 " + result);

        //v
        x = 0;
        y = 0;
        result = (x == 0) || (y == 0);
        System.out.println("if one number is zero " + result);

        //g
        x = -1;
        y = -10;
        int z = -4;
        result = (x < 0) && (y < 0) && (z < 0);
        System.out.println("Every number is negative " + result);

        //d
        x = 5;
        y = 11;
        z = 16;
        result = ((x % 5 == 0) && (y % 5 != 0) && (z % 5 != 0) || (x % 5 != 0) && (y % 5 == 0) && (z % 5 != 0) || (x % 5 != 0) && (y % 5 != 0) && (z % 5 == 0));
        System.out.println("Only one number is multiple to 5 " + result);

        //e
        x = 101;
        y = 102;
        z = 33;
        result = (x > 100) || (y > 100) || (z > 100);
        System.out.println("If one number bigger than 100 " + result);
    }
}
