package com.aca.week6.cartesiansystem;

public class CartesianSystem {
    private int x;
    private int y;

    public synchronized int getX() {
        return x;
    }

    public synchronized void setX(int x) {
        this.x = x;
    }

    public synchronized int getY() {
        return y;
    }

    public synchronized void setY(int y) {
        this.y = y;
    }
}
