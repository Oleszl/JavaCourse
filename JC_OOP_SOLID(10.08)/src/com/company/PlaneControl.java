package com.company;

import java.util.Random;

public class PlaneControl {

    public void moveUp() {
        int value = (int) (20 + Math.random() * 40);
        System.out.println("Літак переміщається вверх на " + value + " метрів");
    }

    public void moveDown() {
        int value = (int) (20 + Math.random() * 40);
        System.out.println("Літак переміщається вниз на " + value + " метрів");
    }

    public void moveLeft() {
        int value = (int) (20 + Math.random() * 40);
        System.out.println("Літак переміщається вліво на " + value + " метрів");
    }

    public void moveRight() {
        int value = (int) (20 + Math.random() * 40);
        System.out.println("Літак переміщається вправо на " + value + " метрів");
    }
}
