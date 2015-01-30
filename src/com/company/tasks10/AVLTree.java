package com.company.tasks10;

import java.util.ArrayList;
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
        balance(container);
    }

    private ValueContainer insert(Integer value, ValueContainer container){
        ValueContainer newContainer = new Node(value, container, null, null, 1);
       if(value > container.getValue()){
           if(container.getRight() == null){
               container.setRight(newContainer);
               container.updateHeights();
               return newContainer;
           }else{
               ValueContainer result = insert(value, container.getRight());
               container.updateHeights();
               return result;
           }
       }else if(value < container.getValue()){
           if(container.getLeft() == null){
               container.setLeft(newContainer);
               container.updateHeights();
               return newContainer;
           }else{
               ValueContainer result = insert(value, container.getLeft());
               container.updateHeights();
               return result;
           }
       }else{
           System.out.println("Value is already containning");
           return null;
       }

    }

    @Override
    public void remove(Integer value) {
        remove0(value, root);
    }

    private ValueContainer remove0(Integer value, ValueContainer container){
        //If no such container in tree
        if(container == null){
            return null;
        }

        if(value > container.getValue()){

            return remove0(value, container.getRight());

        }else if (value < container.getValue()){

            return remove0(value, container.getLeft());

        }else {
            if(container.getLeft() == null && container.getRight() == null){
                removeWithZeroChild(container);
                return container;
            }
        }

        return null;
    }

    private void removeWithZeroChild(ValueContainer delContainer){
        ValueContainer parent = delContainer.getParent();
        //Check for delContainer == root
        if(root == delContainer){
            root = null;
            return;
        }

        if(delContainer.isLeft()){
            parent.setLeft(null);
        }else{
            parent.setRight(null);
        }


        while (parent != null){
            parent.updateHeights();
            parent = parent.getParent();
        }
    }

    @Override
    public boolean contains(Integer value) {
        return contains0(value, root);
    }

    private boolean contains0(Integer value, ValueContainer container){

        if(container == null){
            return false;
        }

        if(value > container.getValue()){
            return contains0(value, container.getRight());
        }else if(value < container.getValue()){
            return contains0(value, container.getLeft());
        }else{
            return true;
        }
    }

    @Override
    public ValueContainer getTop() {
        return root;
    }

    @Override
    public List<ValueContainer> asList() {
        if(root != null)
            return root.asList();
        return new ArrayList<>();
    }

    @Override
    /**
     * using only for tests
     */
    public void updateAllHeights() {
        //if tree empty
       if(root == null){
           return;
       }
        updateAllHeights0(root);
    }

    private void updateAllHeights0(ValueContainer container){
        if(container.getLeft() != null){
            updateAllHeights0(container.getLeft());
        }
        if(container.getRight() != null){
            updateAllHeights0(container.getRight());
        }

        container.updateHeights();
    }

    /**
     * set root of tree
     * @param container
     */
    private void setRoot(ValueContainer container){
        this.root = container;
        container.setParent(null);
    }

    public void rotateLeft(ValueContainer container){
        ValueContainer right = container.getRight();
        //check for root
        if(container == root){
           setRoot(right);
        }else{
            if(container.isLeft()){
                container.getParent().setLeft(right);
            }else{
                container.getParent().setRight(right);
            }
        }
        container.setRight(right.getLeft());
        right.setLeft(container);
        container.updateHeights();
        right.updateHeights();
    }

    public void rotateRight(ValueContainer container){
        ValueContainer left = container.getLeft();
        //check for root
        if(container == root){
            setRoot(left);
        }else{
            if(container.isLeft()){
                container.getParent().setLeft(left);
            }else{
                container.getParent().setRight(left);
            }
        }
        container.setLeft(left.getRight());
        left.setRight(container);
        container.updateHeights();
        left.updateHeights();
    }


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
