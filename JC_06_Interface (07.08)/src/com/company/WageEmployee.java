package com.company;

public class WageEmployee implements Salary{

    private String name;
    private double hour;

    private double suma = 0;



    private static final double RATE = 55;


    public WageEmployee(String name, double hour) {
        this.name = name;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public void salary() {
         suma = hour*RATE;
        System.out.println("Name: " + name + " hour " + hour + " fix-rate = " + RATE + " salary = " + suma);
    }




}
