package com.company.tasks10;

import java.util.List;


public class AVLTree implements Treeish {
    private ValueContainer root;

    @Override
    public void add(Integer value) {
        if(root == null){
            root = new Node(value, null, null, null, 0);
        }
    }

    @Override
    public void remove(Integer value) {

    }

    @Override
    public boolean contains(Integer value) {
        return false;
    }

    @Override
    public ValueContainer getTop() {
        return root;
    }

    @Override
    public List<ValueContainer> asList() {
        if(root != null)
            return root.asList();
        return null;
    }

    @Override
    public void updateAllHeights() {

    }
}
