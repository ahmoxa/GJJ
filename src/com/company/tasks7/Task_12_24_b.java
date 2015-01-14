package com.company.tasks7;

/**
 * Created by vlasyk on 14.01.15.
 */
public class Task_12_24_b {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        fillArr(arr);
        Utils.printArr(arr);
    }

    public static void fillArr(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(i + j < arr.length){
                    arr[i][j] = i + j + 1;
                }else{
                    arr[i][j] = 1 + i + j - arr.length;
                }
            }
        }
    }
}
