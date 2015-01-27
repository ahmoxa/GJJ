package com.company.tasks10;

import java.util.List;


public class AVLTree implements Treeish {
    private ValueContainer root;

    @Override
    public void add(Integer value) {
        if(root == null){
            root = new Node(value, null, null, null, 1);
            return;
        }
        insert(value, root);
        updateAllHeights();

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
               insert(value, container.getLeft());
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
        ValueContainer parent = container.getParent();
        container.setParent(parent.getParent());
        if(container.getParent() == null){
            root = container;
        }
        parent.setRight(container.getLeft());
        if(container.getLeft() != null){
            container.getLeft().setParent(parent);
        }
        container.setLeft(parent);
        parent.setParent(container);
        updateAllHeights();
    }

    public void rotateRight(ValueContainer container){
        ValueContainer parent = container.getParent();
        container.setParent(parent.getParent());
        if(container.getParent() == null){
            root = container;
        }
        parent.setLeft(container.getRight());

        if(container.getRight() != null){
            container.getRight().setParent(parent);
        }
        container.setRight(parent);
        parent.setParent(container);
        updateAllHeights();
    }

    //Not correct
    public void balance(ValueContainer container){

        if(container.getBalanceFactor() == 2){
            if(container.getRight().getBalanceFactor() < 0){
                rotateRight(container);
            }
            rotateLeft(container);
        }else if(container.getBalanceFactor() == -2){
            if(container.getLeft().getBalanceFactor() > 0){
                rotateLeft(container);
            }
            rotateRight(container);
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
