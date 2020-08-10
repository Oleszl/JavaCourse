package com.company;

public class Cy_27 extends Plane implements AbleToTurboAcceleration, AbleToNuclearStrike, AbleToStealthMode {

    private double planeMaxSpeed;
    private String planeColour;

    private PlaneControl planeControl;


    public Cy_27(double lenght, double width, double weight, double planeMaxSpeed, String planeColour) {
        super(lenght, width, weight);
        this.planeMaxSpeed = planeMaxSpeed;
        this.planeColour = planeColour;
        planeControl = new PlaneControl();
    }


    public void getMovementData() {
        planeControl.moveUp();
        planeControl.moveLeft();
        planeControl.moveDown();
        planeControl.moveRight();
    }


    @Override
    public void turboAcceleration() {
        double speedValue = (2501 + Math.random() * (3500 - planeMaxSpeed));
        System.out.println("Турбо прискорення ввімкнено, швидкість =  " + speedValue + " км/год ");
    }

    @Override
    public void nuclearStrike() {
        int value = (int) (Math.random() * 10);
        System.out.println("Літак скинув  " + value + " боєголовок ");
    }

    @Override
    public void stealthMode() {
        int value = (int) (1 + (Math.random() * 30));
        System.out.println("Stealth Mode включено, літака не буде видно на протязі " + value + " секунд ");

    }
}
