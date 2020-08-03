package com.company;

import java.lang.invoke.StringConcatFactory;
import java.text.Format;

public class Car {
    private String name;
    private String model;

    private Handlebar diametr;
    private Wheel size;
    private Body body;


    public void brake() {
        System.out.println("Braking");
    }

    public Car(String name, String model, Handlebar diametr, Wheel size, Body body) {
        this.name = name;
        this.model = model;
        this.diametr = diametr;
        this.size = size;
        this.body = body;
    }

    public Car() {
        this.name = "BMW";
        this.model = "X5";
    }

    @Override
    public String toString() {
        return String.format("name " + name);
    }
}
