package com.company.tasks7.task_12_25;


import com.company.tasks7.Utils;

public class Task_12_25o {
    public static void main(String[] args) {
        int[][] arr = new int[12][10];
        fillArr(arr);
        Utils.printArr(arr);
    }

    public static void fillArr(int[][] arr) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i % 2 == 0){
                    arr[arr.length - 1 - i][arr[i].length - 1 - j] = count++;
                }else{
                    arr[arr.length - 1 - i][j] = count++;
                }
            }
        }
    }
}
