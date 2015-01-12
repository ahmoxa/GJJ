package com.company.tasks5.task10;


public class Task_10_43_b {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(countNumbers(n) == 3);

        n = 23;
        System.out.println(countNumbers(n) == 2);

        n = 1010;
        System.out.println(countNumbers(n) == 4);

        n = 0;
        System.out.println(countNumbers(n) == 1);

        n = 1;
        System.out.println(countNumbers(n) == 1);
    }

    public static int countNumbers(int n){
        if(n / 10 == 0){
            return 1;
        }else{
            return 1 + countNumbers(n / 10);
        }
    }
}
