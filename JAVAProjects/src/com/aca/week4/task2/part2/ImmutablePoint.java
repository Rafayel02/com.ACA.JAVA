package com.aca.week4.task2.part2;

public final class ImmutablePoint implements Point {
    private final int x;
    private final int y;

    public ImmutablePoint(final ImmutablePoint point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public ImmutablePoint(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    public Point shiftUp() {
        return new ImmutablePoint(this.x, this.y + 1);
    }

    public Point shiftRight() {
        return new ImmutablePoint(this.x + 1, this.y);
    }

    public Point shiftDown() {
        return new ImmutablePoint(this.x, this.y - 1);
    }

    public Point shiftLeft() {
        return new ImmutablePoint(this.x - 1, this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ImmutablePoint)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        ImmutablePoint other = (ImmutablePoint) o;
        return this.getX() == other.getX() &&
                this.getY() == other.getY();
    }

    @Override
    public String toString() {
        return "ImmutablePoint " +
                "x=" + x +
                ", y=" + y;
    }
}
