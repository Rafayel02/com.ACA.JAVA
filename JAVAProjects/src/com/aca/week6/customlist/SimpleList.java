package com.aca.week6.customlist;

public interface SimpleList<T> {
    int SIZE_OF_ARRAY = 10000;

    void add(T item);

    int getSize();

    T get(int index);
}
