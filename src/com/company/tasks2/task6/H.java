package com.company.tasks2.task6;

import java.util.Scanner;

/**
 * Created by anton on 25.12.2014.
 */
public class H {
    public static void main(String[] args) {
        System.out.println("Input A,i");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = (1<<i - 1);
        int result = (a & mask)>>i-1;
        System.out.println(String.format("Before A = (bin)%s\nbit i = (bin)%s",
                Integer.toBinaryString(a), Integer.toBinaryString(result)));
    }
}
