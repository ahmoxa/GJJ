package com.company.tasks5.task10;


public class Task_10_42 {
    public static void main(String[] args) {
        int result = myPow(4, 3);
        System.out.println(result);
    }

    public static int myPow(int n, int a){
        if(n > 1){
            return a * myPow(--n, a);
        }else{
            return a;
        }
    }
}
