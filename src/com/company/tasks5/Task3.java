package com.company.tasks5;


public class Task3 {
    public static void main(String[] args) {
        String string = "TestString";
        boolean result = string.charAt(0) == string.charAt(string.length() - 1);
        System.out.println(result);

        string = "TestStringT";
        result = string.charAt(0) == string.charAt(string.length() - 1);
        System.out.println(result);
    }
}
