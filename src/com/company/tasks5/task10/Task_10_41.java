package com.company.tasks5.task10;


public class Task_10_41 {
    public static void main(String[] args) {
        int result = fact(10);
        System.out.println(result);
    }

    public static int fact(int n){
        if(n > 1){
            return n * fact(--n);
        }else{
            return 1;
        }
    }
}
