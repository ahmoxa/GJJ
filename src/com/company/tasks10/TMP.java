package com.company.tasks10;


public class TMP {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        AVLTreePrinter.printTree(avlTree.getTop());

        avlTree.add(16);

        AVLTreePrinter.printTree(avlTree.getTop());
    }
}
