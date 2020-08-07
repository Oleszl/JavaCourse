package com.company.com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator  implements Numerable {


    @Override
    public double devide(double x, double y) {
        double devideSuma = x/y;
        return devideSuma;
    }

    @Override
    public double minus(double x, double y) {
        double minusSuma = x-y;
        return minusSuma;
    }

    @Override
    public double multiply(double x, double y) {
        double multiplySuma = x*y;
        return multiplySuma;
    }

    @Override
    public double plus(double x, double y) {
        double plusSuma = x+y;
        return plusSuma;
    }
}
