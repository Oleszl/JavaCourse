package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть значення змінної n: ");
        int n;
        n = scan.nextInt();
        scan.close();
        task1();
        task2();
        task3(n);
        task4(-55,3);
        task5(18);
        bubbleSort(25);

    }

    public static void task1() {
        System.out.println("Завдання №1:");
        for (int i = 0; i < 110; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        System.out.println("\nЗавдання №2:");
        for (int i = 95; i > 0; i -= 2) {
            System.out.print(i + " ");
        }
    }

    public static void task3(int n) {
        System.out.println("\nЗавдання №3:");
        if (n % 2 == 0)
            System.out.println("Число " + n + " парне");
        else
            System.out.println("Число " + n + " непарне");
    }

    public static void task4(double n, double m){

        System.out.println("Завдання №4:");
        if (Math.abs(10-n) >Math.abs(10-m))
            System.out.println("Число "+m+" є найближче до 10");
        else System.out.println("Число "+n+" є найближче до 10");

    }

    public static void task5(int size) {
        int[] array = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Завдання №5");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            else if (array[i] > max)
                max = array[i];
        }

        System.out.println("\nМаксимальний елемент масиву = " + max + "");
        System.out.println("Мінімальний елемент масиву = " + min + "");
    }

    public static void bubbleSort(int n){

        int[] array = new int[n];
        System.out.println("Завдання №6");
        System.out.println("Невідсортований масив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90);
            System.out.print(array[i] + " ");

        }

        int numberOfReplacements=0;
        boolean replacements = true;

        while (replacements) {

            replacements = false;

            for (int i = 0; i < array.length - 1-numberOfReplacements; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    replacements=true;
                }
            }
            numberOfReplacements++;
        }

        System.out.println("\nВідсортований масив:");
        for (int i:array){
            System.out.print(i +" ");
        }




    }



}
