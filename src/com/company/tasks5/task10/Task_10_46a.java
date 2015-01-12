package com.company.tasks5.task10;


public class Task_10_46a {
    public static void main(String[] args) {
        int a1 = 1;
        int q = 3;
        int n = 2;
        double An = a1 * Math.pow(q, n - 1);
        System.out.println("CalcAn = " + findAn(n, a1, q) + " FactAn = " + An + " " + String.valueOf(findAn(n, a1, q) == An));

        a1 = 1;
        q = 3;
        n = 6;
        An = a1 * Math.pow(q, n - 1);
        System.out.println("CalcAn = " + findAn(n, a1, q) + " FactAn = " + An + " " + String.valueOf(findAn(n, a1, q) == An));


        a1 = 3;
        q = 35;
        n = 1;
        An = a1 * Math.pow(q, n - 1);
        System.out.println("CalcAn = " + findAn(n, a1, q) + " FactAn = " + An + " " + String.valueOf(findAn(n, a1, q) == An));



        a1 = 7;
        q = 1;
        n = 10;
        An = a1 * Math.pow(q, n - 1);
        System.out.println("CalcAn = " + findAn(n, a1, q) + " FactAn = " + An + " " + String.valueOf(findAn(n, a1, q) == An));
    }

    public static int findAn(int n, int a1, int q){
        if(n == 1 || q == 1){
            return a1;
        }else{
            return findAn(n-1, a1 * q, q);
        }
    }
}
