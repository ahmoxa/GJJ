package com.company.tasks2;


public class Task7 {
    public static void main(String[] args) {
        //1 - XOR
        int a = 3;
        int b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(String.format("XOR: a = %d; b = %d", a, b));

        //2 - SUM
        a = 3;
        b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(String.format("SUM: a = %d; b = %d", a, b));

        //3 - Multiply
        a = 3;
        b = 5;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(String.format("MUL: a = %d; b = %d", a, b));
    }
}
