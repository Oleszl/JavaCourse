package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow();
        cow1.voice();

        Cat cat1 = new Cat();
        cat1.voice();

        Dog dog1 = new Dog();
        dog1.voice();

        Coin coin1 = new Coin();
        coin1.CoinToss();

        Amphibia frog1 =   new Frog();
        frog1.eat();
        frog1.sleep();
        frog1.swim();
        frog1.walk();

        exponentialRecord();



    }
    public static void exponentialRecord(){
        Float f1 = Float.MAX_VALUE;
        Float f2 = Float.MIN_VALUE;

        System.out.println("Float max value = "+f1);
        System.out.println("Float min value = "+f2);

        Double d1 = Double.MAX_VALUE;
        Double d2 = Double.MIN_VALUE;

        System.out.println("Double max value = "+d1);
        System.out.println("Double min value = "+d2);


    }
}
