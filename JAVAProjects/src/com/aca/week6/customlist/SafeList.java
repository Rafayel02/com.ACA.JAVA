package com.aca.week6.customlist;

public class SafeList<T> implements SimpleList<T> {

    private Object[] container = new Object[SIZE_OF_ARRAY];

    private int index = -1;

    @Override
    public synchronized void add(T item) {
        if (index != container.length) {
            container[++index] = item;
        }
    }

    @Override
    public synchronized int getSize() {
        return index + 1;
    }

    @Override
    public synchronized T get(int index) {
        if (index >= 0 && index < container.length) {
            if (index <= this.index) {
                return (T) container[index];
            }
        }
        return null;
    }

}
