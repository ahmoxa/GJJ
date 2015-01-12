package com.company.tasks5.task10;


public class Task_10_43_a {
    public static void main(String[] args) {
        int n = 233;
        System.out.println(sumNumbers(n) == 8);

        n = 7;
        System.out.println(sumNumbers(n) == 7);

        n = 999;
        System.out.println(sumNumbers(n) == 27);

        n = 1000;
        System.out.println(sumNumbers(n) == 1);
    }

    public static int sumNumbers(int n){
        if(n / 10 == 0){
            return n % 10;
        }else{
            return n % 10 + sumNumbers(n / 10);
        }
    }
}
