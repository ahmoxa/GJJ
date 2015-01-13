package com.company.tasks5.task10;


public class Task_10_55 {
    public static void main(String[] args) {
        int n = 4;
        int radix = 2;
        System.out.println(convert(n, radix));
        n = 453;
        radix = 8;
        System.out.println(convert(n, radix));
    }

    public static String convert(int n, int radix){
        StringBuilder stringBuilder = new StringBuilder();
        if(n >= radix){
            stringBuilder.append(convert(n/radix, radix));
        }
        stringBuilder.append(n%radix);
        return stringBuilder.toString();
    }
}
