package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction {

    ArrayList<Delegate> delegateList = new ArrayList<>();




   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fraction() {
    }

    public Fraction(String name) {
        this.name = name;

    }

Delegate delegate = null;
    public void addDelegate(Fraction fraction) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть вагу депутата: ");
        double weight = scanner.nextDouble();
        System.out.println("Введіть зріст депутата: ");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть прізвище депутата: ");
        String lastname = scanner.nextLine();
        System.out.println("Введіть ім\'я депутата: ");
        String name = scanner.nextLine();
        System.out.println("Введіть вік депутата: ");
        int age = scanner.nextInt();
        System.out.println("Введіть чи хабарник депутат: ");
        boolean bribe = scanner.nextBoolean();

        delegate = new Delegate(weight, height, lastname, name, age, bribe,fraction);

        delegate.giveBribe();
            delegateList.add(delegate);
            showAllDelegate();







    }

    public void bribeCheck() {

        Iterator<Delegate> iterator = delegateList.iterator();
        while (iterator.hasNext()) {
            Delegate delegate = iterator.next();
            if (delegate.isBribe()) {
                System.out.println(delegate);

            }
        }
    }

    public void removeAllDelegate() {
        delegateList.clear();
        System.out.println("Усіх депутатів видалено із фракції");
    }

    public void maxDelegateBribe() {
        delegateList.sort(new BribeComparator());
        System.out.println(delegateList.get(delegateList.size() - 1));
    }

    public void removeDelegate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть порядковий номер депутата, якого ви хочете видалити: ");
        int index = scanner.nextInt();
        delegateList.remove(index);
        System.out.println("Депутата видалено!");
    }

    public void showAllDelegate() {
        System.out.println("Список усіх депутатів фракції: ");

        Iterator<Delegate> iterator = delegateList.iterator();
        while (iterator.hasNext()){
            Delegate delegate = iterator.next();
            System.out.println(delegate);

        }

    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                '}';
    }




}




