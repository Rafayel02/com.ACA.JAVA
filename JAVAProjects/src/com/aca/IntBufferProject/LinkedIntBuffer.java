package com.aca.IntBufferProject;

public class LinkedIntBuffer extends IntBuffer {

    private LinkedIntBuffer next;

    public LinkedIntBuffer getNext() {
        return next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append("->");

        if (this.next != null) {
            sb.append(this.next);
        } else {
            sb.append("null");
        }

        return sb.toString();
    }
}
