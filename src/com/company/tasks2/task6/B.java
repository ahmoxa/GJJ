package com.company.tasks2.task6;


import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        System.out.println("Input n,m; n<31 and n!=m");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int nPow = 1 << n;
        int mPow = 1 << m;
        int result = nPow + mPow;
        System.out.println(String.format("2^n + 2^m = %d + %d = %d", nPow, mPow, result));
    }
}
