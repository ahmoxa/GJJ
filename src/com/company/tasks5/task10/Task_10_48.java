package com.company.tasks5.task10;


public class Task_10_48 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,23,4,7,1,0,4,44,1,5,6,23,4,7,1,0,4,44,1,5,6,23,4,7,1,0,4,44,1,5,6,23,4,7,1,0,4,44,1,5,6,23,4,7,1,0,4,44,1,5,6,23,4,7,1,0,4,44,1,5,6,23,4,7,1,0,4,44, 99};
        int max = max(arr, 0);
        System.out.println(max);
    }

    public static int max(int[] arr, int i){
        int curMax = arr[i];
        if(i + 1 >= arr.length){
            return curMax;
        }
        int nextMax = max(arr, i + 1);

        if(curMax > nextMax){
            return curMax;
        }else{
            return nextMax;
        }
    }
}
