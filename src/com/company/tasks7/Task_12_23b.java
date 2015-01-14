package com.company.tasks7;


public class Task_12_23b {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        Task_12_23a.setCross(arr);
        setMiddleLines(arr);
        Utils.printArr(arr);
    }

    public static void setMiddleLines(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == arr.length/2 || j == arr.length/2){
                    arr[i][j] = 1;
                }
            }
        }
    }
}
