package com.company.tasks5.task10;


public class Task_10_45b {
    public static void main(String[] args) {
        int a1 = 1;
        int d = 3;
        int n = 2;
        double  Sn = ((2 * a1 + d * (n - 1)) / 2d) * n;
        System.out.println("CalcSum = " + findSum(a1, d, n) + " FactSum = " + Sn + " " + String.valueOf(findSum(a1, d, n) == Sn));


        a1 = 54;
        d = 7;
        n = 33;
        Sn = ((2 * a1 + d * (n - 1)) / 2d) * n;
        System.out.println("CalcSum = " + findSum(a1, d, n) + " FactSum = " + Sn + " " + String.valueOf(findSum(a1, d, n) == Sn));
    }

    public static int findSum(int a1, int d, int n){
        if(n == 1){
            return a1;
        }else{
            return a1 + findSum(a1 + d, d, n - 1);
        }
    }
}
