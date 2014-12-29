package com.company.tasks3;


public class Task2 {
    public static void main(String[] args) {
        byte b = (byte)0b1111_1111;
        char c = (char) b;
        int i = (int) c;
        System.out.println(Integer.toBinaryString(i));

    }
}
