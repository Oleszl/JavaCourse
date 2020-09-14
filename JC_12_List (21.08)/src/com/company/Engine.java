package com.company;

public class Engine {
    private int cylinderNumber;

    public Engine(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }

    @Override
    public String toString() {
        return "Engine " +
                "cylinderNumber= " + cylinderNumber ;
    }
}
