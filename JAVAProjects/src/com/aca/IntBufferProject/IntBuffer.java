package com.aca.IntBufferProject;

public class IntBuffer {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
