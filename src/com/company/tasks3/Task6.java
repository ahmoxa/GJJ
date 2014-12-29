package com.company.tasks3;

import java.util.Scanner;

/**
 * Created by vlasyk on 29.12.14.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String numS = String.valueOf(num);
//        System.out.println(new StringBuilder()
//                .append(numS.charAt(0))
//                .append(numS.charAt(2))
//                .append(numS.charAt(1))
//                .toString()
//        );

        int tmp = num%10 * 10 + num%100 / 10 + num%1000 / 100 * 100;
        System.out.println(tmp);
    }
}
