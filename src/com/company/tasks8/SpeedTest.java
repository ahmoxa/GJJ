package com.company.tasks8;


public class SpeedTest {
    public static void main(String[] args) {
        speedTest(10_000);
        speedTest(1_000_000);
    }

    public static void speedTest(int times){
        DynamicArray dynamicArray = new DynamicArray();
        DoublyLinkedList linkedList = new DoublyLinkedList();
        System.out.println("---------SPEED TEST FOR N = " + times + "-------------------");

        //Add to the end
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.add(i);
        }
        long addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.add(i);
        }
        long addLL = System.currentTimeMillis() - start;
        System.out.println("add to end  :    DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Add to the begin
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.add(0, i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.add(0, i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("add to begin:    DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Add to the middle
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.add(dynamicArray.size()/2, i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("add to middl:    DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Get from the begin
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.get(0);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.get(0);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("get from begin:    DA = " + addDA + "ms  LL = " + addLL + "ms");


        //Get from the end
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.get(dynamicArray.size() - 1);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.get(linkedList.size() - 1);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("get from end:      DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Get from the middle
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.get(dynamicArray.size()/2);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.get(linkedList.size()/2);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("get from mid:      DA = " + addDA + "ms  LL = " + addLL + "ms");


        //Remove from the begin
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.remove(0);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.remove(0);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("remove from begin:      DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Remove from the end
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.remove(dynamicArray.size() - 1);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("remove from end:        DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Remove from the middle
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.remove(dynamicArray.size()/2);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.remove(linkedList.size()/2);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("remove from mid:        DA = " + addDA + "ms  LL = " + addLL + "ms");

        //RemoveElement
        //insert someElements
        for (int i = 0; i < times*10; i++) {
            dynamicArray.add(i);
            linkedList.add(i);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.removeElement(i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.removeElement(i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("removeElement:          DA = " + addDA + "ms  LL = " + addLL + "ms");

        //IndexOF
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.indexOf(i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.indexOf(i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("IndexOF:          DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Contains
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.contains(i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.contains(i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("Contains:          DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Set in the begin
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.set(0,i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.set(0,i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("Set in the begin:          DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Set in the end
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.set(dynamicArray.size() - 1,i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.set(linkedList.size() - 1,i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("Set in the end:            DA = " + addDA + "ms  LL = " + addLL + "ms");

        //Set in the mid
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            dynamicArray.set(dynamicArray.size()/2,i);
        }
        addDA = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            linkedList.set(linkedList.size()/2,i);
        }
        addLL = System.currentTimeMillis() - start;
        System.out.println("Set in the mid:            DA = " + addDA + "ms  LL = " + addLL + "ms");
    }
}
