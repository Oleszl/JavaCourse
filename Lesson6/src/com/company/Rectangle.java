package com.company;

public class Rectangle {

    double length;
    double width;

    public static int number =0;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
        number++;
    }

    Rectangle(){
        this.length=5;
        this.width=7;
        number++;
    }





     public void perimeter(){
         double perimeter = 2*( length*width);
         System.out.printf("Периметр %d прямокутника = %f \n",number,   perimeter);
     }

     public void square(){
         double square = length*width;
         System.out.printf("Площа %d прямокутника = %f \n",number,  square);
     }
}
