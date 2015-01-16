package com.company.tasks7;


public class Task_12_28 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillArr(arr);
        Utils.printArr(arr);
    }

    public static void fillArr(int[][] arr){
        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = arr.length;

        for (int i = 0; i < arr.length * arr.length; i++) {
            arr[row][col] = i + 1;
            if (--visits == 0) {
                visits = arr.length * (dirChanges % 2) +
                        arr.length * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }
    }
}
