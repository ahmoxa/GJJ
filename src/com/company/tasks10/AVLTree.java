package com.company.tasks10;

import java.util.List;


public class AVLTree implements Treeish {
    private ValueContainer root;

    @Override
    public void add(Integer value) {
        if(value == null){
            return;
        }
        if(root == null){
            root = new Node(value, null, null, null, 1);
            return;
        }
        ValueContainer container = insert(value, root);
        updateAllHeights();
        balance(container);
    }

    private ValueContainer insert(Integer value, ValueContainer container){
        ValueContainer newContainer = new Node(value, container, null, null, 1);
       if(value > container.getValue()){
           if(container.getRight() == null){
               container.setRight(newContainer);
               return newContainer;
           }else{
             return insert(value, container.getRight());
           }
       }else if(value < container.getValue()){
           if(container.getLeft() == null){
               container.setLeft(newContainer);
               return newContainer;
           }else{
               return insert(value, container.getLeft());
           }
       }else{
           System.out.println("Value is already containning");
       }
        return null;
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
        if(root.getRight() != null){
            root.getRight().updateHeights();
        }

        if(root.getLeft() != null){
            root.getLeft().updateHeights();
        }
        root.updateHeights();
    }

    public void rotateLeft(ValueContainer container){
        ValueContainer right = container.getRight();
        //check for root
        if(container == root){
           root = right;
        }

        right.setParent(container.getParent());
        if(container.getParent() != null){
            container.getParent().setLeft(right);
        }
        container.setRight(right.getLeft());
        if(right.getLeft() != null){
            right.getLeft().setParent(container);
        }
        right.setLeft(container);
        container.setParent(right);
        updateAllHeights();
    }

    public void rotateRight(ValueContainer container){
        ValueContainer left = container.getLeft();
        //check for root
        if(container == root){
            root = left;
        }
        //set left parent  former container parent
        left.setParent(container.getParent());
        if(container.getParent() != null){
            container.getParent().setRight(left);
        }
        //move left's right child to container's right
        container.setLeft(left.getRight());
        if(left.getRight() != null){
            left.getRight().setParent(container);
        }


        left.setRight(container);
        container.setParent(left);
        updateAllHeights();
    }

    //Not correct
    public void balance(ValueContainer container){
        if(container == null) return;
        if(container.getBalanceFactor() == 2){
            if(container.getRight().getBalanceFactor() < 0){
                rotateRight(container.getRight());
            }
            rotateLeft(container);
        }else if(container.getBalanceFactor() == -2){
            if(container.getLeft().getBalanceFactor() > 0){
                rotateLeft(container.getLeft());
            }
            rotateRight(container);
        }

        if(container.getParent() != null){
            balance(container.getParent());
        }

    }

    public ValueContainer getContainer(int value, ValueContainer container){
        if(value == container.getValue()){
            return container;
        }else if(value > container.getValue()){
            return getContainer(value, container.getRight());
        }else if(value < container.getValue()){
            return getContainer(value, container.getLeft());
        }
        return null;
    }
}
