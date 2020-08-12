package com.company;

public class SalaryEmployee implements Salary {

    private String name;
    private int day;

    private double oklad = 15000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public SalaryEmployee(String name, int day) {
        this.name = name;
        this.day = day;
    }

    @Override
    public void salary() {
        double salarysuma = oklad / 24 * day;
        System.out.println("name: " + name + " oklad = " + oklad + " day: " + day + " salary= " + salarysuma);

    }
}
