package com.company.tasks5.task10;


public class Task_10_51 {
    public static void main(String[] args) {
        System.out.println("--------Test for A task--------");
        String answer = "54321";
        System.out.print("Answer: "
                + answer + " Fact: ");
        methodA(5);
        System.out.println("\n");

        System.out.println("--------Test for B task--------");
        answer = "12345";
        System.out.print("Answer: "
                + answer + " Fact: ");
        methodB(5);
        System.out.println("\n");

        System.out.println("--------Test for C task--------");
        answer = "5432112345";
        System.out.print("Answer: "
                + answer + " Fact: ");
        methodC(5);
        System.out.println("\n");

    }

    public static void methodA(int n){
        if(n > 0){
            System.out.print(n);
            methodA(n - 1);
        }
    }


    public static void methodB(int n){
        if(n > 0){
            methodB(n - 1);
            System.out.print(n);
        }
    }

    public static void methodC(int n){
        if(n > 0){
            System.out.print(n);
            methodC(n - 1);
            System.out.print(n);
        }
    }
}
