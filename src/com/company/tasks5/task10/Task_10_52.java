package com.company.tasks5.task10;


public class Task_10_52 {
    public static void main(String[] args) {
        int n = 123;
        printNumbersReverse(n);
        System.out.println();
        n = 1;
        printNumbersReverse(n);
        System.out.println();
        n = 789130;
        printNumbersReverse(n);
    }

    public static void printNumbersReverse(int n){
        System.out.print(n % 10);
        if(n / 10 != 0){
            printNumbersReverse(n / 10);
        }
    }
}
