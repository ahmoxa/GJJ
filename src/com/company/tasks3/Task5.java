package com.company.tasks3;

/**
 * Created by vlasyk on 29.12.14.
 */
public class Task5 {
    public static void main(String[] args) {
        int num = 123456;
//        System.out.println(new StringBuilder(String.valueOf(num)).reverse().toString());
        int multiplier = 10;
        while (true){
            int _multiplier = multiplier / 10;
            int tmp = num%multiplier / _multiplier;
            if(tmp == 0) break;
            System.out.print(tmp);
            multiplier*=10;
        }
    }
}
