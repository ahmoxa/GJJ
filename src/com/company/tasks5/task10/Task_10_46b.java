package com.company.tasks5.task10;


public class Task_10_46b {
    public static void main(String[] args) {
        int a1 = 1;
        int q = 3;
        int n = 2;
        double Sn = (a1 * (1 - Math.pow(q, n))) / (1 - q);
        System.out.println("CalcSum = " + findSum(a1, q, n) + " FactSum = " + Sn + " " + String.valueOf(findSum(a1, q, n) == Sn));

        a1 = 1;
        q = 3;
        n = 6;
        Sn = (a1 * (1 - Math.pow(q, n))) / (1 - q);
        System.out.println("CalcAn = " + findSum(a1, q, n) + " FactAn = " + Sn + " " + String.valueOf(findSum(a1, q, n) == Sn));

        a1 = 4;
        q = 2;
        n = 10;
        Sn = (a1 * (1 - Math.pow(q, n))) / (1 - q);
        System.out.println("CalcAn = " + findSum(a1, q, n) + " FactAn = " + Sn + " " + String.valueOf(findSum(a1, q, n) == Sn));
    }

    public static int findSum(int a1, int q, int n){
        if(n == 1){
            return a1;
        }else{
            return a1 + findSum(a1 * q, q, n - 1);
        }
    }
}
