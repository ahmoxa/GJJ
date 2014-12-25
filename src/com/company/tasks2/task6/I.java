package com.company.tasks2.task6;

import java.util.Arrays;
import java.util.Scanner;


public class I {
    public static void main(String[] args) {
        System.out.println("Input A type byte");
        Scanner scanner = new Scanner(System.in);
        int a = 7;//scanner.nextInt();

        int[] n = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        int m = 2;
        for(int i = 0;; i++)
        {
            n[n.length - 1 - i] = a % 2;
            if(a < 2) break;
            a/=2;
        }


    }
}
