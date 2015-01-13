package com.company.tasks5.task10;


public class Task_10_50 {
    public static void main(String[] args) {
        int n = 1;
        int m = 3;
        int answer = 5;
        int result = akkerman(n, m);
        System.out.println("Calc A = " + result +
                            " Fact A = " + answer +
                            " " + String.valueOf(result == answer));

        n = 0;
        m = 0;
        answer = 1;
        result = akkerman(n, m);
        System.out.println("Calc A = " + result +
                " Fact A = " + answer +
                " " + String.valueOf(result == answer));

        n = 3;
        m = 3;
        answer = 61;
        result = akkerman(n, m);
        System.out.println("Calc A = " + result +
                " Fact A = " + answer +
                " " + String.valueOf(result == answer));
    }

    public static int akkerman(int n, int m){
        if(n == 0){
            return m + 1;
        }else if(m == 0){
            return akkerman(n - 1, 1);
        }else{
            return akkerman(n - 1, akkerman(n, m - 1));
        }
    }
}
