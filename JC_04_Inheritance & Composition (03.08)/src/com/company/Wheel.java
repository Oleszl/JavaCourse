package com.company;

public class Wheel {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Wheel(double size) {
        this.size = size;
    }

    public void increaseWheel() {
        size *= 2;

    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                '}';
    }
}
