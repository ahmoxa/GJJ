package com.company.tasks5;


public class Task8 {
    public static void main(String[] args) {
        String string = "TestString";
        int m = 3;
        int n = 0;

        char[] stringChars = string.toCharArray();
        char tmp = stringChars[m];
        stringChars[m] = stringChars[n];
        stringChars[n] = tmp;
        String result = new String(stringChars);
        System.out.println(result);
    }
}
