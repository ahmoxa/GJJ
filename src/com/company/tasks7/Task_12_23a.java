package com.company.tasks7;


import java.util.Arrays;

public class Task_12_23a {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        setCross(arr);
        Utils.printArr(arr);

    }

    public static void setCross(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    arr[i][j] = 1;
                }else if(i + j == arr.length - 1){
                    arr[i][j] = 1;
                }
            }
        }
    }
}
