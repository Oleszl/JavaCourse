package com.company;

import com.company.com.lgs.lab.interface2.MyCalculator;

public class Main {

    public static void main(String[] args) {
        WageEmployee we1 = new WageEmployee("Oles", 45);

        we1.salary();

        SalaryEmployee se1 = new SalaryEmployee("Nazar", 12);
        se1.salary();

        MyCalculator mc1 = new MyCalculator();

        System.out.println("Devide: "+mc1.devide(18.5,7));
        System.out.println("Minus: "+mc1.minus(9,3));
        System.out.println("Multiply: "+mc1.multiply(2.9,7));
        System.out.println("Plus : "+mc1.plus(5.5,9.15));


    }
}
