package com.company.tasks7;


import java.util.Arrays;

public class Task_11_158 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 1};
        System.out.println(Arrays.toString(arr));

        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void removeDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int curItem = arr[i];
                if(curItem == 0){
                    continue;
                }else if(curItem == arr[j]){
                    remove(arr, j);
                }
            }
        }
    }

    private static void remove(int[] arr, int removeIndex) {
        System.arraycopy(arr, removeIndex + 1, arr, removeIndex, arr.length - 1 - removeIndex);
        arr[arr.length - 1] = 0;
    }
}
