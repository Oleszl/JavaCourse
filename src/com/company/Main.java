package com.company;

public class Main {

    public static void main(String[] args) {
       Rectangle r1 = new Rectangle(5,7);
       r1.perimeter();
       r1.square();

       Rectangle r2 = new Rectangle();
       r2.square();
       r2.perimeter();

       Circle c1 = new Circle(5,4);
       c1.circleLenght();
       c1.circleSquere();
    }
}
