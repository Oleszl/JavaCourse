package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {

    ArrayList<Fraction> fractionArrayList = new ArrayList<Fraction>();


//4,5.7

    public void removeFraction() {
        System.out.println("Введіть назву фракцію, яку ви хочете видалити: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        fractionArrayList.removeIf(f -> f.getName().equalsIgnoreCase(name));

    }


    public void showAllFraction() {
        System.out.println("Список фракцій: ");
        System.out.println(fractionArrayList);
    }



    /*public void addDelegateToFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть до якої фракції ви хочете додати депутата: ");
        String fraction = scanner.nextLine();
        Fraction fraction2 = new Fraction(fraction);
        for (Fraction f : fractionArrayList) {
            if (f.getFractionName().equalsIgnoreCase(fraction)) {
                fraction2.addDelegate();
                fractionDelegate.add(fraction2);
                System.out.println(fractionDelegate);
            } else System.out.println("Даної фракції не знайдено");

        }
    }*/

    public void addFraction() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть назву фракції: ");
        String name = scanner.nextLine();
        Fraction fraction = new Fraction(name);
        fractionArrayList.add(fraction);


    }


    public void addDelegateToFraction() {
        Scanner scanner = new Scanner(System.in);
        Fraction fraction2 = null;
        System.out.println("Введіть до якої фракції ви хочете додати депутата: ");
        String fractionn = scanner.nextLine();
        fraction2 = new Fraction(fractionn);

        fraction2.addDelegate(fraction2);


    }

    public void removeDelegateFromFraction() {
        Fraction fraction = new Fraction();
        fraction.removeDelegate();

    }

    public void deleteAllDelegateFromFraction() {
        Fraction fraction = new Fraction("q");
        Delegate d = new Delegate(fraction);

        for (Fraction f : fractionArrayList) {
            if (f.getName().equalsIgnoreCase(String.valueOf(d.getFraction()))) {
                System.out.println(23);
            }
        }
    }
}








