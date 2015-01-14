package com.company.tasks7;


public class Task_12_23c {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        setTriangles(arr);
        Utils.printArr(arr);
    }

    public static void setTriangles(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if((i <= j && j < arr.length - i) || (i >= j && j > arr.length - 2 - i))
                {
                    arr[i][j] = 1;
                }
            }
        }
    }
}
