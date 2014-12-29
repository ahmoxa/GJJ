package com.company.tasks4;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input dollar rate... ");
        int rate = scanner.nextInt();

        for(int i = 1; i <= 20; i++ ){
            System.out.println(String.format("%d dollar(s) = %d ruble(s)", i, i * rate));
        }
    }
}
