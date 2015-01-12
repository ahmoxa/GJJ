package com.company.tasks5.task10;


public class Task_10_45a {
    public static void main(String[] args) {
        int a1 = 1;
        int d = 3;
        int n = 2;
        int An = a1 + (n - 1) * d;
        System.out.println(findAn(2, a1, d) == An);

        a1 = 1;
        d = 3;
        n = 6;
        An = a1 + (n - 1) * d;
        System.out.println(findAn(n, a1, d) == An);


        a1 = 100;
        d = 55;
        n = 55;
        An = a1 + (n - 1) * d;
        System.out.println(findAn(n, a1, d) == An);

        a1 = 100;
        d = 0;
        n = 55;
        An = a1 + (n - 1) * d;
        System.out.println(findAn(n, a1, d) == An);

        a1 = 100;
        d = 100;
        n = 1;
        An = a1 + (n - 1) * d;
        System.out.println(findAn(n, a1, d) == An);
    }


    public static int findAn(int n, int a1, int d){
        if(n == 1 || d == 0){
            return a1;
        }else{
            return findAn(n-1, a1 + d, d);
        }
    }
}
