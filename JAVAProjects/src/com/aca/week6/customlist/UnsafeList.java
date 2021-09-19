package com.aca.week6.customlist;

public class UnsafeList<T> implements SimpleList<T> {

    private Object[] container = new Object[SIZE_OF_ARRAY];

    private int index = -1;

    @Override
    public void add(T item) {
        if (index != container.length) {
            container[++index] = item;
        }
    }

    @Override
    public int getSize() {
        return index;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < container.length) {
            if (index <= this.index) {
                return (T) container[index];
            }
        }
        return null;
    }
}
