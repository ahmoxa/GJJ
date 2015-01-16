package com.company.tasks7;


public class Task_12_234a {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        Utils.printArr(arr);
        System.out.println();
        deleteRow(arr, 3);
        Utils.printArr(arr);
    }

    public static void deleteRow(int[][] arr, int row){
        System.arraycopy(arr, row + 1, arr, row, arr.length - 1 - row);
        int[] lastRow = new int[arr[arr.length - 1].length];
        arr[arr.length - 1] = lastRow;
    }
}
