package com.company;

public class Circle {
    double radius;
    double diametr;

    public Circle(double radius, double diametr) {
        this.radius = radius;
        this.diametr = diametr;
    }

    public void circleSquere(){

        double squereе = Math.PI/4*Math.pow(diametr,2);
        System.out.printf("Площа кола = %.4f ", squereе);
    }

    public void circleLenght(){
        double lenght = 2*Math.PI*radius;
        System.out.printf("Довжина кола = %.4f\n",lenght);
    }
}
