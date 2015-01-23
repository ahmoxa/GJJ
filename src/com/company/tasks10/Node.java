package com.company.tasks10;


import java.util.ArrayList;
import java.util.List;

public class Node implements ValueContainer{
    private Integer value;
    private ValueContainer parent;
    private ValueContainer left;
    private ValueContainer right;
    private int height;

    public Node(Integer value, ValueContainer parent, ValueContainer left, ValueContainer right, int height) {
        this.value = value;
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.height = height;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public ValueContainer getParent() {
        return parent;
    }

    @Override
    public void setParent(ValueContainer parent) {
        this.parent = parent;
    }

    @Override
    public ValueContainer getLeft() {
        return left;
    }

    @Override
    public void setLeft(ValueContainer container) {
        this.left = container;
    }

    @Override
    public ValueContainer getRight() {
        return right;
    }

    @Override
    public void setRight(ValueContainer container) {
        this.right = container;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLeftHeight() {
        return left.getHeight();
    }

    @Override
    public void setLeftHeight(int leftHeight) {

    }

    @Override
    public int getRightHeight() {
        return right.getHeight();
    }

    @Override
    public void setRightHeight(int rightHeight) {

    }

    @Override
    public void updateHeights() {
        if(left != null)
            left.updateHeights();
        if(right != null)
            right.updateHeights();

        this.height = getRightHeight() - getLeftHeight();
    }

    @Override
    public boolean isBalanced() {
        int bfactor = right.getHeight() - left.getHeight();
        return (bfactor >= -1 || bfactor <= 1);
    }

    @Override
    public boolean isEmpty() {
        return value == null;
    }

    @Override
    public boolean isLeft() {
        return this.value < parent.getValue();
    }

    @Override
    public List<ValueContainer> asList() {
        List<ValueContainer> list = new ArrayList<>();
        list.add(this);

        return list;
    }
}
