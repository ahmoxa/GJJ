package com.company.tasks2.task6;


import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        System.out.println("Input A,i");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = ~(1<<i - 1);
        int result = a & mask;
        System.out.println(String.format("Before A = (bin)%s\nAfter A = (bin)%s",
                Integer.toBinaryString(a), Integer.toBinaryString(result)));
    }
}
