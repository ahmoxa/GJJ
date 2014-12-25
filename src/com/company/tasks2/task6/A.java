package com.company.tasks2.task6;


import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        System.out.println("Input n, n<32");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 1<<n;
        System.out.println("2^n = (bin): " + Integer.toBinaryString(result) + "; (dec): " + result + ";");
    }
}
