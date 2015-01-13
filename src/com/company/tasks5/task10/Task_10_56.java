package com.company.tasks5.task10;


public class Task_10_56 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isEven(n));

        n = 16;
        System.out.println(isEven(n));
    }

    public static boolean isEven(int n){
        int sqrt = (int)Math.round(Math.sqrt(n));
        return isEven0(n, sqrt);
    }

    public static boolean isEven0(int n,int t){
        if(t == 1){
            return true;
        }else{
            return (n%t != 0) && isEven0(n, t - 1);
        }
    }
}
