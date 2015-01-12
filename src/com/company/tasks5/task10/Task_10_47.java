package com.company.tasks5.task10;


public class Task_10_47 {
    public static void main(String[] args) {
        int k = 6;
        System.out.println(getFib(k) == 8);

        k = 4;
        System.out.println(getFib(k) == 3);

        k = 8;
        System.out.println(getFib(k) == 21);
    }

    public static int getFib(int k){
        if(k == 1 || k == 2){
            return 1;
        }else if(k == 0){
            return 0;
        }else{
            return getFib(k - 1) + getFib(k - 2);
        }
    }
}
