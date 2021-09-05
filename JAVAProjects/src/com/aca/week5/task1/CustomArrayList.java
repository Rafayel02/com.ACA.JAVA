package com.aca.week5.task1;

import com.aca.week5.sortingalgorithms.BubbleSorter;
import com.aca.week5.sortingalgorithms.QuickSorter;
import com.aca.week5.sortingalgorithms.Sorter;

public class CustomArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAXIMUM_CAPACITY = 1000;
    private Object[] array;
    private int currentIndex = 0;

    public CustomArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public void add(T t) {
        if (isAbleToAdd()) {
            array[currentIndex++] = t;
        }
    }

    public void add(int index, T t) {
        if (index > this.currentIndex || index < 0) {
            throw new RuntimeException("Index is out of array's bounds");
        }
        if (isAbleToAdd()) {
            addWithShift(index, t);
            currentIndex++;
        }
    }

    public void addFromBeginning(T t) {
        add(0, t);
    }

    public int size() {
        return this.currentIndex;
    }

    public int testSize() {
        return this.array.length;
    }

    public void deleteByElement(T t) {
        int index = getIdByElement(t);
        if (index == -1) {
            throw new RuntimeException("No such element in array");
        }
        deleteAndShift(index);
        currentIndex--;
        if (needToReduce()) {
            reduce();
        }
    }

    public void deleteByIndex(int index) {
        if (index > this.currentIndex - 1 || index < 0) {
            throw new RuntimeException("Index is out of array's bounds");
        }
        deleteAndShift(index);
        currentIndex--;
        if (needToReduce()) {
            reduce();
        }
    }

    public int getIdOfElement(T t) {
        int idByElement = getIdByElement(t);
        if (idByElement == -1) {
            throw new RuntimeException("No such element in array");
        }
        return idByElement;
    }

    public void sortByBubble() {
        Sorter sorter = new BubbleSorter();
        sortBy(sorter);
    }

    public void sortByQuick() {
        Sorter sorter = new QuickSorter();
        sortBy(sorter);
    }

    private void reduce() {
        Object[] temp = new Object[this.array.length / 2];
        for (int i = 0; i < currentIndex; i++) {
            temp[i] = this.array[i];
        }
        this.array = temp;
    }

    private boolean needToReduce() {
        if (this.array.length == DEFAULT_CAPACITY) {
            return false;
        }
        return currentIndex < this.array.length / 2;
    }

    private void sortBy(Sorter sorter) {
        try {
            array = sorter.sort(this.array, size());
        } catch (Exception e) {
            throw new RuntimeException("Only Integers can be sorted");
        }
    }

    private void addWithShift(int index, T t) {
        if (index > this.currentIndex) {
            return;
        }
        T temp = (T) array[index];
        array[index] = t;
        addWithShift(index + 1, temp);
    }

    private void deleteAndShift(int index) {
        for (int i = index; i < currentIndex; i++) {
            array[i] = array[i + 1];
        }
    }

    private int getIdByElement(T t) {
        for (int i = 0; i < currentIndex; i++) {
            if (array[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isAbleToAdd() {
        if (currentIndex == MAXIMUM_CAPACITY) {
            return false;
        }
        if (needToGrow()) {
            grow();
        }
        return true;
    }

    private void grow() {
        array = copyArray(array, this.array.length * 2);
    }

    private Object[] copyArray(Object[] from, int sizeOfNewArray) {
        Object[] to = new Object[sizeOfNewArray];
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
        return to;
    }

    private boolean needToGrow() {
        return this.array.length == currentIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentIndex; i++) {
            if (i == 0) {
                sb.append("[");
            }
            sb.append(array[i]);
            if (i == currentIndex - 1) {
                sb.append("]");
                continue;
            }
            sb.append(", ");
        }

        return sb.toString();
    }
}
