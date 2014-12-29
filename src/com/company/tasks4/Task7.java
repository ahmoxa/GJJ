package com.company.tasks4;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //a
        int result = 0;
        for(int i = 100; i <= 500; i++){
            result += i;
        }

        System.out.println("Sum 100 - 500 = " + result);

        //b
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a pls..");
        int a = scanner.nextInt();
        result = 0;
        for (int i = a; i <= 500; i++) {
            result += i;
        }
        System.out.println("Sum " + a + " - 500 = " + result);

        //v
        System.out.println("Input b pls...");
        int b = scanner.nextInt();
        result = 0;
        for (int i = -10; i <= b; i++) {
            result += i;
        }
        System.out.println("Sum -10 - " + b + " = " + result);

        //g
        System.out.println("Input a and b pls...");
        a = scanner.nextInt();
        b = scanner.nextInt();
        result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        System.out.println("Sum " + a + " - " + b + " = " + result);
    }
}
