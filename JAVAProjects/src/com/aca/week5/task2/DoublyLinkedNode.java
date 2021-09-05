package com.aca.week5.task2;

public class DoublyLinkedNode<T> {
    private DoublyLinkedNode left;
    private DoublyLinkedNode right;
    private int index;
    private T value;

    public T getValue() {
        return value;
    }

    public DoublyLinkedNode(T t) {
        this.value = t;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public DoublyLinkedNode getLeft() {
        return left;
    }

    public void setLeft(DoublyLinkedNode left) {
        this.left = left;
    }

    public DoublyLinkedNode getRight() {
        return right;
    }

    public void setRight(DoublyLinkedNode right) {
        this.right = right;
    }
}
