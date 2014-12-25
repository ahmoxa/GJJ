package com.company.tasks2.task6;

import java.util.Arrays;
import java.util.Scanner;


public class I {
    public static void main(String[] args) {
        System.out.println("Input A type byte");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 7; i >= 0; i --){
            int mask = (1<<i);
            int result = (a & mask)>>i;
            System.out.print(result);
      }


    }
}
