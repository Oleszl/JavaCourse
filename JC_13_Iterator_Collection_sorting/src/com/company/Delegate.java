package com.company;

import java.util.Scanner;

public class Delegate extends Human {
    private String lastname;
    private String name;
    private int age;
    private boolean bribe;
    private double bribeSuma;

    Fraction fraction;

    public Delegate(double weight, int height, String lastname, String name, int age, boolean bribe,Fraction fraction) {
        super(weight, height);
        this.lastname = lastname;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
        this.fraction=fraction;

    }


    public Delegate( Fraction fraction) {
        this.fraction = fraction;
    }


    public Delegate() {

    }



    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    public double getBribeSuma() {
        return bribeSuma;
    }

    public void setBribeSuma(double bribeSuma) {
        this.bribeSuma = bribeSuma;
    }

    public Fraction getFraction() {
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
    }

    public void giveBribe(){
        double suma=0;
        if(!bribe) {
            System.out.println("Цей депутат не бере хабарів");
        }
        else if(bribe) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введіть суму хабара: ");
             suma = scan.nextDouble();


        }
        if (suma>5000){
            System.out.println("Милиция увязнить депутата");
        }
        else {bribeSuma=suma;
            }
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                ", bribeSuma=" + bribeSuma +
                ", fraction=" + fraction +
                '}';

    }

}

