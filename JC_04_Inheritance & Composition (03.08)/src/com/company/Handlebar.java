package com.company;

public class Handlebar {
    private double diametr;

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public Handlebar(double diametr) {
        this.diametr = diametr;
    }

    public void decreaseHandlebar() {
        diametr /= 2;

    }

    @Override
    public String toString() {
        return "Handlebar{" +
                "diametr=" + diametr +
                '}';
    }
}
