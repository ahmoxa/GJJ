package com.company.tasks10;


import java.util.List;

public interface ValueContainer {
    Integer getValue();

    void setValue(Integer value);

    ValueContainer getParent();

    void setParent(ValueContainer parent);

    ValueContainer getLeft();

    void setLeft(ValueContainer container);

    ValueContainer getRight();

    void setRight(ValueContainer container);

    /**
     * @return height of this vertex,
     * that is max of heights of left and right subtrees + 1
     */
    int getHeight();

    int getLeftHeight();

    void setLeftHeight(int leftHeight);

    int getRightHeight();

    void setRightHeight(int rightHeight);

    /**
     * recursively updates all heights in both subtrees and height of this vertex.
     */
    void updateHeights();

    /**
     * @return if heights of left and right subtree difference is between [-1, 1]
     */
    boolean isBalanced();

    /**
     * @return if this vertex does not contain any value.
     */
    boolean isEmpty();

    /**
     * @return true if this vertex is the left child of it's parent.
     */
    boolean isLeft();

    /**
     * @return this subtree as a sorted list of ValueContainers
     */
    List<ValueContainer> asList();

    int getBalanceFactor();
}
