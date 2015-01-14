package com.company.tasks7;


public class Task_12_24a {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        fillArr(arr);
        Utils.printArr(arr);
    }

    public static void fillArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0 || j == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }
        }
    }
}
