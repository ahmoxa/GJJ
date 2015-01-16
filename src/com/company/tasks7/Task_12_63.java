package com.company.tasks7;


public class Task_12_63 {
    public static void main(String[] args) {
        int[][] arr = getArr();
        Utils.printArr(arr);
        printAvg(arr);
    }

    public static int[][] getArr(){
        int[][] result = new int[11][4];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 20) + 1;
            }
        }

        return result;
    }

    public static void printAvg(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            int avg = total / arr[i].length;
            System.out.println("avg student in " + (i + 1) + " class = " + avg);
        }
    }
}
