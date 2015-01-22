package com.company.tasks8;


import java.util.LinkedList;

public class DoublyLinkedListTest {


    public static void main(String[] args) {



    }

    public static void addTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        int index0 = list.add(10);
        int index1 = list.add(5);
        int index2 = list.add(9);
        int index3 = list.add(6);

        boolean passed = list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=6} -> ");
        passed = passed && (index0 == 0) && (index1 == 1) && (index2 == 2) && (index3 == 3);
        if(passed)
            System.out.println("addTest PASSED!");
        else
            System.out.println("addTest FAILED!");
    }

    public static void insertTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(6);

        list.add(0, 1);
        list.add(4, 7);
        list.add(4, 8);

        boolean passed = list.toString().equals("{value=1} -> {value=10} -> {value=5} -> {value=9} -> {value=8} -> {value=7} -> {value=6} -> ");
        if(passed)
            System.out.println("insertTest PASSED!");
        else
            System.out.println("insertTest FAILED!");
    }

    public static void getTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(6);

        list.add(0, 1);
        list.add(4, 7);
        list.add(4, 8);



        int val = list.get(0);
        boolean passed0 = val == 1;

        val = list.get(1);
        boolean passed1 = val == 10;

        val = list.get(2);
        boolean passed2 = val == 5;

        val = list.get(3);
        boolean passed3 = val == 9;

        val = list.get(4);
        boolean passed4 = val == 8;

        val = list.get(5);
        boolean passed5 = val == 7;

        val = list.get(6);
        boolean passed6 = val == 6;

        boolean passed = passed0 && passed1 && passed2 && passed3 && passed4 && passed5 && passed6;
        if(passed)
            System.out.println("getTest PASSED!");
        else
            System.out.println("getTest FAILED!");
    }

    public static void sizeTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        boolean passed = list.size() == 0;

        list.add(1);
        passed = passed && (list.size() == 1);

        list.add(2);
        passed = passed && (list.size() == 2);

        list.add(0, 2);
        passed = passed && (list.size() == 3);

        if(passed)
            System.out.println("sizeTest PASSED!");
        else
            System.out.println("sizeTest FAILED!");
    }

    public static void removeTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(14);
        list.add(15);
        list.add(15);

        boolean passed = list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ");

        int removeValue = list.remove(3);
        passed = passed && (removeValue == 6) && (list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=14} -> {value=15} -> {value=15} -> ")) && (list.size() == 6);

        removeValue = list.remove(0);
        passed = passed && (removeValue == 10) && list.toString().equals("{value=5} -> {value=9} -> {value=14} -> {value=15} -> {value=15} -> ") && (list.size() == 5);

        removeValue = list.remove(4);
        passed = passed && (removeValue == 15) && list.toString().equals("{value=5} -> {value=9} -> {value=14} -> {value=15} -> ") && (list.size() == 4);


        if(passed)
            System.out.println("removeTest PASSED!");
        else
            System.out.println("removeTest FAILED!");
    }

    public static void removeElementTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(14);
        list.add(15);
        list.add(15);

        boolean passed = list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ");

        int removeIndex = list.removeElement(6);
        passed = passed && (removeIndex == 3) && (list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=14} -> {value=15} -> {value=15} -> ")) && (list.size() == 6);

        removeIndex = list.removeElement(10);
        passed = passed && (removeIndex == 0) && list.toString().equals("{value=5} -> {value=9} -> {value=14} -> {value=15} -> {value=15} -> ") && (list.size() == 5);

        removeIndex = list.removeElement(15);
        passed = passed && (removeIndex == 3) && list.toString().equals("{value=5} -> {value=9} -> {value=14} -> {value=15} -> ") && (list.size() == 4);


        if(passed)
            System.out.println("removeElementTest PASSED!");
        else
            System.out.println("removeElementTest FAILED!");
    }

    public static void indexOfTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(14);
        list.add(15);
        list.add(15);

        boolean passed = list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ");

        int index = list.indexOf(14);
        passed = passed && (index == 4);

        index = list.indexOf(15);
        passed = passed && (index == 5);

        index = list.indexOf(10);
        passed = passed && (index == 0);

        index = list.indexOf(5);
        passed = passed && (index == 1);

        index = list.indexOf(9);
        passed = passed && (index == 2);

        index = list.indexOf(6);
        passed = passed && (index == 3);


        if(passed)
            System.out.println("indexOfTest PASSED!");
        else
            System.out.println("indexOfTest FAILED!");
    }

    public static void containsTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(14);
        list.add(15);
        list.add(15);

        boolean passed = list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ");

        boolean contains = list.contains(14);
        passed = passed && (contains);

        contains = list.contains(15);
        passed = passed && (contains);

        contains = list.contains(99);
        passed = passed && (!contains);

        contains = list.contains(10);
        passed = passed && (contains);

        contains = list.contains(16);
        passed = passed && (!contains);


        if(passed)
            System.out.println("containsTest PASSED!");
        else
            System.out.println("containsTest FAILED!");
    }

    public static void setTest(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(14);
        list.add(15);
        list.add(15);

        boolean passed = list.toString().equals("{value=10} -> {value=5} -> {value=9} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ");

        int index = 0;
        int newVal = 1;
        int oldVal = list.set(index, newVal);
        passed = passed && (oldVal == 10) &&  (list.toString().equals("{value=1} -> {value=5} -> {value=9} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ") && (list.get(index) == newVal));

        index = 1;
        newVal = 50;
        oldVal = list.set(index, newVal);
        passed = passed && (oldVal == 5) &&  (list.toString().equals("{value=1} -> {value=50} -> {value=9} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ") && (list.get(index) == newVal));

        index = 2;
        newVal = 90;
        oldVal = list.set(index, newVal);
        passed = passed && (oldVal == 9) &&  (list.toString().equals("{value=1} -> {value=50} -> {value=90} -> {value=6} -> {value=14} -> {value=15} -> {value=15} -> ") && (list.get(index) == newVal));



        index = 4;
        newVal = 41;
        oldVal = list.set(index, newVal);
        passed = passed && (oldVal == 14) &&  (list.toString().equals("{value=1} -> {value=50} -> {value=90} -> {value=6} -> {value=41} -> {value=15} -> {value=15} -> ") && (list.get(index) == newVal));


        index = 6;
        newVal = 51;
        oldVal = list.set(index, newVal);
        passed = passed && (oldVal == 15) &&  (list.toString().equals("{value=1} -> {value=50} -> {value=90} -> {value=6} -> {value=41} -> {value=15} -> {value=51} -> ") && (list.get(index) == newVal));

        if(passed)
            System.out.println("setTest PASSED!");
        else
            System.out.println("setTest FAILED!");
    }
}
