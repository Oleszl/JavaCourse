package com.company;

import java.util.function.Consumer;

public class ConstructorTask {

    String name, surname;
    int age;

    public ConstructorTask(int age) {
        this.age = age;
    }


    public ConstructorTask(int age, String name, String surname) {
        this(age);
        this.name = name;
        this.surname = surname;
    }

    public ConstructorTask(ConstructorTask constructorTask, ConstructorTask constructorTask1, ConstructorTask constructorTask2) {

    }


    @Override
    public String toString() {
        return "ConstructorTask{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
