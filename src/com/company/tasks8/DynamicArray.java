package com.company.tasks8;


public class DynamicArray {
    private int size;
    private int[] elementData;
    private int capacity = 10;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        elementData = new int[capacity];
    }

    public DynamicArray() {
        elementData = new int[capacity];
    }

    public int add(int e){
        checkAndGrow(size + 1);
        int index = size++;
        elementData[index] = e;
        return index;
    }

    public void add(int i, int e){
        if(i > size)
            return;
        checkAndGrow(size + 1);
        System.arraycopy(elementData, i, elementData, i + 1, size - i);
        elementData[i] = e;
        size++;
    }

    public int get (int index){
        return elementData[index];
    }

    public int remove(int index){
        int removeElement = elementData[index];
        if(index != size - 1){
            System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        }
        size--;
        elementData[size] = 0;
        return removeElement;
    }

    public int removeElement(int e){
        for (int i = 0; i < size; i++) {
            if(e == elementData[i]){
                remove(i);
                return i;
            }
        }
        return -1;
    }

    public int size(){
        return size;
    }

    public int indexOf(int e){
        for (int i = 0; i < size; i++) {
            if(e == elementData[i]){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int e){
        for (int i = 0; i < size; i++) {
            if(e == elementData[i]){
                return true;
            }
        }
        return false;
    }
    public int set(int i, int e){
        int prevValue = elementData[i];
        elementData[i] = e;
        return prevValue;
    }

    private void checkAndGrow(int l){
        if(isGrowNeed(l)){
            grow();
        }
    }
    private boolean isGrowNeed(int l){
        if(l > elementData.length){
            return true;
        }else
            return false;
    }

    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        int[] newElementData = new int[newCapacity];
        System.arraycopy(elementData, 0, newElementData, 0, oldCapacity);
        elementData = newElementData;
    }
}
