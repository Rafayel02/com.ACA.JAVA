package com.aca.week5.sortingalgorithms;

public class BubbleSorter implements Sorter {
    @Override
    public Object[] sort(Object[] notSortedArray, int size) throws ClassCastException{
        if(size == 1) {
            return notSortedArray;
        }
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < size - 1; i++) {

                int left = (int) notSortedArray[i];
                int right = (int) notSortedArray[i + 1];

                if (left > right) {
                    notSortedArray[i] = right;
                    notSortedArray[i+1] = left;
                    swapped = true;
                }

            }
        } while (swapped);
        return notSortedArray;
    }
}
