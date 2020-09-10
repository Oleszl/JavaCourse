package com.company;

public class Human {
    private double weight;
    private int height;

    public Human(double weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Human() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
