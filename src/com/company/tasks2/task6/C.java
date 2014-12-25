package com.company.tasks2.task6;


import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        System.out.println("Input A,i");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();

        int result = (a>>i)<<i;
        System.out.println(String.format("Before A = %s\nAfter A = %s",
                Integer.toBinaryString(a), Integer.toBinaryString(result)));
    }
}
