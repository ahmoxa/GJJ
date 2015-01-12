package com.company.tasks5.task10;


public class Task_10_44 {

    public static void main(String[] args) {
        int n = 239;
        System.out.println(findDigitRoot(n) == 5);

        n = 999;
        System.out.println(findDigitRoot(n) == 9);

        n = 9;
        System.out.println(findDigitRoot(n) == 9);

        n = 1;
        System.out.println(findDigitRoot(n) == 1);

        n = 10;
        System.out.println(findDigitRoot(n) == 1);

        n = 734;
        System.out.println(findDigitRoot(n) == 5);
    }

    public static int findDigitRoot(int n){
        int sumNumbers = Task_10_43_a.sumNumbers(n);
        if(Task_10_43_b.countNumbers(sumNumbers) == 1){
            return sumNumbers;
        }else{
            return findDigitRoot(sumNumbers);
        }
    }
}

