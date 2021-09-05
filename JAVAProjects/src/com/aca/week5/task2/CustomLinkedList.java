package com.aca.week5.task2;

import com.aca.week5.sortingalgorithms.Sorter;

public class CustomLinkedList<T> {

    private DoublyLinkedNode<T> currentNode = null;
    private DoublyLinkedNode<T> start = currentNode;

    public void addFromBeginning(T t) {
        add(t, 0);
    }

    public void add(T t, int index) {
        if (doesElementExist(t)) {
            throw new RuntimeException("Duplication of value: " + t);
        }
        if (this.start == null && index != 0) {
            throw new RuntimeException("Invalid index");
        }
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(t);

        //From start
        if (index == 0) {
            if (start == null) {
                currentNode = new DoublyLinkedNode<>(t);
                currentNode.setLeft(null);
                start = currentNode;
                return;
            }
            newNode.setRight(start);
            newNode.setLeft(null);
            start.setLeft(newNode);
            start = newNode;
            return;
        }

        //From middle
        DoublyLinkedNode<T> temp = start;
        int counter = 0;

        do {
            if (index == counter) {
                newNode.setLeft(temp.getLeft());
                newNode.setRight(newNode.getLeft().getRight());
                newNode.getLeft().setRight(newNode);
                temp.setLeft(newNode);
                return;
            }
            temp = temp.getRight();
            counter++;
        } while (temp != null);

        //From end
        if (index == counter) {
            add(t);
            return;
        }

        throw new RuntimeException("Invalid index");
    }

    public void add(T value) {
        if (doesElementExist(value)) {
            throw new RuntimeException("Duplication of value: " + value);
        }
        DoublyLinkedNode<T> temp = new DoublyLinkedNode<>(value);
        currentNode.setRight(temp);
        temp.setLeft(currentNode);
        currentNode = temp;
    }

    public void deleteElement(T t) {
        DoublyLinkedNode<T> temp = start;
        do {
            if (temp.getValue().equals(t)) {
                if (temp == start) {
                    start = temp.getRight();
                    start.getLeft().setLeft(null);
                    start.setLeft(null);
                    return;
                }
                if (temp == currentNode) {
                    currentNode = temp.getLeft();
                    currentNode.getRight().setLeft(null);
                    currentNode.setRight(null);
                    return;
                }
                temp.getLeft().setRight(temp.getRight());
                temp.getRight().setLeft(temp.getLeft());
                temp.setRight(null);
                temp.setLeft(null);
                return;
            }
            temp = temp.getRight();
        } while (temp != null);
        throw new RuntimeException("No such element");
    }

    public int getIdFromElement(T t) {
        DoublyLinkedNode<T> temp = start;
        int counter = 0;
        do {
            if (temp.getValue().equals(t)) {
                return counter;
            }
            temp = temp.getRight();
            counter++;
        } while (temp != null);
        throw new RuntimeException("No such element");
    }

    @Override
    public String toString() {
        if (start == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        DoublyLinkedNode<T> temp = start;
        sb.append("[");
        do {
            sb.append(temp.getValue());
            sb.append(", ");
            temp = temp.getRight();
        } while (temp != null);
        sb.replace(sb.length() - 2, sb.length(), "");
        sb.append("]");
        return sb.toString();
    }

    private boolean doesElementExist(T t) {
        if (start == null) {
            return false;
        }
        DoublyLinkedNode<T> temp = start;
        do {
            if (temp.getValue() == t) {
                return true;
            }
            temp = temp.getRight();
        } while (temp != null);
        return false;
    }
}
