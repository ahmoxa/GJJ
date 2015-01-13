package com.company.tasks5.task10;


public class Task_10_53 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArrReverse(arr, 0);
        System.out.println();
        arr = new int[]{4, 32, 5,1,99,23};
        printArrReverse(arr, 0);
    }

    public static void printArrReverse(int[] arr, int pos){
        if(pos <= arr.length - 1){
            printArrReverse(arr, pos + 1);
            System.out.print(arr[pos] + " ");
        }
    }
}
