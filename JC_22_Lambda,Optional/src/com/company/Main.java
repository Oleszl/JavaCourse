package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        Cow cow1 = new Cow();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        List<Pet> petList = Arrays.asList(cow1, cat1, dog1);
        petList.forEach(Pet::voice);


    }

    public static void task2() {
        int random = (int) (Math.random() * 2);
        Predicate<Integer> predicate = (integer) -> integer == 0;

        if (predicate.test(random))
            System.out.println("Орел");
        else
            System.out.println("Решка");

    }

    public static void task3() {
        Supplier<Float> floatSupplier = () -> (float) Float.MAX_EXPONENT;
        System.out.println(floatSupplier.get());
    }

    public static void task4(){
        InterfaceWithThreePparameters<ConstructorTask> createConstr = ConstructorTask::new;
        System.out.println( createConstr.get(19,"Oles","Sukmanovskyi"));
    }

    public static void task5() {
        Amphibia frog = new Frog();

        Consumer<Amphibia> frogConsumer = (f) -> {
            f.sleep();
            f.walk();
            f.swim();
        };
        frogConsumer.accept(frog);
    }


}
