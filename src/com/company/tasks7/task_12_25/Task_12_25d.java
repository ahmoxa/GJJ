package com.company.tasks7.task_12_25;


import com.company.tasks7.Utils;

public class Task_12_25d {
    public static void main(String[] args) {
        int[][] arr = new int[12][10];
        fillArr(arr);
        Utils.printArr(arr);
    }

    public static void fillArr(int[][] arr){
        int count = 1;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[arr.length - 1 - j][i] = count++;
            }
        }
    }
}
