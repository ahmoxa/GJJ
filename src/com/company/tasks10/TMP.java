package com.company.tasks10;


import java.util.List;
import java.util.Scanner;

public class TMP {
    static int i = 1_000_000;
    public static void main(String[] args) {

        AVLTree avlTree = new AVLTree();
//
//       long start = System.currentTimeMillis();
//        for (; i >= 0; i--) {
//            avlTree.add(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start + "ms");


        avlTree.add(3);
        avlTree.add(1);
        avlTree.add(9);
        avlTree.add(7);
        AVLTreePrinter.printTree(avlTree.getTop());
        avlTree.remove(7);
        AVLTreePrinter.printTree(avlTree.getTop());
    }
}
