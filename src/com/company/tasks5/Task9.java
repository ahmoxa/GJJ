package com.company.tasks5;


import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        String string = "Test string for task";

        String[] words = string.split(" ");
        String tmp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tmp;
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        result = result.trim();
        System.out.println(result);
        System.out.println(Arrays.toString(result.toCharArray()));
    }
}
