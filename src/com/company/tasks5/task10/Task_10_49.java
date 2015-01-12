package com.company.tasks5.task10;


public class Task_10_49 {

    public static void main(String[] args) {
        int[] arr = {1,2,6,3,5,7};
        System.out.println(maxIndex(arr, 0));
    }

    public static int maxIndex(int[] arr, int i){
        int curMax = arr[i];
        if(i + 1 >= arr.length){
            return i;
        }
        int nextMaxIndex = maxIndex(arr, i + 1);
        int nextMax = arr[nextMaxIndex];

        if(curMax > nextMax){
            return i;
        }else{
            return nextMaxIndex;
        }
    }
}
