package com.company.tasks2.task6;


import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        System.out.println("Input A,n");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        int mask = ~(-1<<n);
        int result = a & mask;
        System.out.println(String.format("Before A = (bin)%s\nAfter A = (bin)%s",
                Integer.toBinaryString(a), Integer.toBinaryString(result)));
    }
}
