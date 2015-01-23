package com.company.tasks9;


import java.util.HashMap;

public class AATest {

    public static void main(String[] args) {
        AssociativeArray associativeArray = new AssociativeArray();
        HashMap<String, String> map = new HashMap<>();

//        associativeArray.add("1", "FIRST");
//        associativeArray.add("2", "SECOND");
//        associativeArray.add("11", "ELEVEN");
//        associativeArray.add("111", "111");
//        associativeArray.add("112", "112");
//        associativeArray.add("113", "113");
//        associativeArray.add("114", "114");
//        associativeArray.add("115", "115");
//        associativeArray.add("116", "116");
//        associativeArray.remove("111");
//        System.out.println(associativeArray);
//        associativeArray.add("111", "new111");
//        System.out.println(associativeArray);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            associativeArray.add(String.valueOf(i), "Value for " + i);
        }
        long myEnd = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            map.put(String.valueOf(i), "Value for " + i);
        }
        long mapEnd = System.currentTimeMillis() - start;
        System.out.println("-------------ADD TIME---------------");
        System.out.println(String.format("MyTime: %d\tMapTime: %d", myEnd, mapEnd));


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            associativeArray.containsKey(String.valueOf(i));
        }
        myEnd = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            map.containsKey(String.valueOf(i));
        }
        mapEnd = System.currentTimeMillis() - start;
        System.out.println("-------------CONTAINS TIME---------------");
        System.out.println(String.format("MyTime: %d\tMapTime: %d", myEnd, mapEnd));


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            associativeArray.remove(String.valueOf(i));
        }
        myEnd = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            map.remove(String.valueOf(i));
        }
        mapEnd = System.currentTimeMillis() - start;
        System.out.println("-------------REMOVE TIME---------------");
        System.out.println(String.format("MyTime: %d\tMapTime: %d", myEnd, mapEnd));

    }


}
