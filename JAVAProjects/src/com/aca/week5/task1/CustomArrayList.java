package com.aca.week5.task1;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class CustomArrayList<T> {
    private final int DEFAULT_CAPACITY;
    private static final int MAXIMUM_CAPACITY = 1000;
    private Object[] array;
    private int size = 0;

    public CustomArrayList() {
        this.DEFAULT_CAPACITY = 10;
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int defaultCapacity) {
        if (defaultCapacity > MAXIMUM_CAPACITY) {
            throw new RuntimeException("Choose capacity less than " + MAXIMUM_CAPACITY);
        }
        this.DEFAULT_CAPACITY = defaultCapacity;
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public void add(T t) {
        if (isAbleToAdd()) {
            array[size++] = t;
        }
    }

    public void add(int index, T t) {
        if(index >= this.size - 1) {
            throw new RuntimeException("Index is out of array's bounds");
        }
        if (isAbleToAdd()) {
            Object[] tempArray = new Object[++size];
            for (int i = 0; i < tempArray.length; i++) {
                if (i >= index) {
                    if (i == index) {
                        tempArray[i] = t;
                        continue;
                    }
                    tempArray[i] = array[i - 1];
                    continue;
                }
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    public void addFromBeginning(T t) {
        add(0, t);
    }

    public int size() {
        return this.size;
    }

    private boolean isAbleToAdd() {
        if (size == MAXIMUM_CAPACITY) {
            return false;
        }
        if (needToGrow()) {
            grow();
        }
        return true;
    }

    private void grow() {
        Object[] tempArray = new Object[this.array.length * 2];
        copyArray(array, tempArray);
        array = tempArray;
    }

    private void copyArray(Object[] from, Object[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    private boolean needToGrow() {
        return this.array.length == size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append("[");
            }
            sb.append(array[i]);
            if (i == size - 1) {
                sb.append("]");
                continue;
            }
            sb.append(", ");
        }

        return sb.toString();
    }
}
