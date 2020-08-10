package com.company;

public abstract class Plane {

    private double lenght;
    private double width;
    private double weight;


    public Plane(double lenght, double width, double weight) {
        this.lenght = lenght;
        this.width = width;
        this.weight = weight;
    }

    void startEngines() {
        int time = (int) (Math.random() * 60);
        System.out.println("До запуску залишилось " + time + " секунд");

    }

    void planeTakeOff() {
        int distance = (int) (Math.random() * 1000);
        System.out.println("Літак проїде на повному баку палива " + distance + " км");
    }

    void planeLand() {
        System.out.println("Літак іде на посадку");
    }
}
