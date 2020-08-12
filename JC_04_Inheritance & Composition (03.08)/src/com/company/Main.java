package com.company;

public class Main {

    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.work();

        CoffeRobot cr1 = new CoffeRobot();
        cr1.work();

        RobotDancer rd1 = new RobotDancer();
        rd1.work();

        RobotCooker rc1 = new RobotCooker();
        rc1.work();

        Robot[] robots = {r1, cr1, rd1, rc1};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }


        Handlebar hb1 = new Handlebar(12.0);
        Wheel wheel1 = new Wheel(18);
        Body body1 = new Body("Седан");

        Car c1 = new Car("Audi", "A6", hb1, wheel1, body1);

        c1.brake();

        Animal a1 = new Animal("Dog", 20, 7);


        System.out.println("Animal Name: " + a1.getName() + " Speed: " + a1.getSpeed() +" km/h"+ " Age: " + a1.getAge() + " years");

        a1.setName("Cat");
        a1.setSpeed(22.7);
        a1.setAge(2);

        System.out.println("Animal Name: " + a1.getName() + " Speed: " + a1.getSpeed() +" km/h"+ " Age: " + a1.getAge() + " years");



    }
}

