package com.company.tasks3;


public class Task7 {
    public static void main(String[] args) {
        int h = 0;
        int m = 0;
        int s = 0;


        int total = s + m*60 + (h%12)*3600;
        double degreePerSec = 360d / (12d * 3600d);
        System.out.println(total*degreePerSec);
    }
}
