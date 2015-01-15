package com.company.tasks7.task_12_25;


import com.company.tasks7.Utils;

public class Task_12_25e {
    public static void main(String[] args) {
        int[][] arr = new int[10][12];
        fillArr(arr);
        Utils.printArr(arr);
    }

    public static void fillArr(int[][] arr){
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i % 2 == 0)
                    arr[i][j] = count++;
                else
                    arr[i][arr.length  - j + 1] = count++;
            }
        }
    }
}
