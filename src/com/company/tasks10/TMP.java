package com.company.tasks10;


import java.util.List;

public class TMP {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

//        avlTree.add(3);
//        avlTree.add(2);
//        avlTree.add(6);
//        avlTree.add(4);
//        avlTree.add(7);
        avlTree.add(1);
        avlTree.add(2);
        avlTree.add(3);


        AVLTreePrinter.printTree(avlTree.getTop());

//        System.out.println("------ROTATE---------");
//        ValueContainer pivot = avlTree.getContainer(6, avlTree.getTop());
//        avlTree.rotateLeft(pivot);
//        AVLTreePrinter.printTree(avlTree.getTop());
//
//        System.out.println("------ROTATE---------");
//        pivot = avlTree.getContainer(3, avlTree.getTop());
//        avlTree.rotateRight(pivot);
//        AVLTreePrinter.printTree(avlTree.getTop());

    }
}
