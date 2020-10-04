package com.company;

import java.util.Scanner;

public class MyThread extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the amount of Fibonacci numbers: ");
        int number = scanner.nextInt();
        int firstElement = 1;
        int secondElement = 1;
        int fibonacciNumber = 0;

        try {

            System.out.print(firstElement + " " + secondElement + " ");
            for (int i = 3; i <= number; i++) {
                Thread.sleep(1000);
                fibonacciNumber = firstElement + secondElement;
                System.out.print(fibonacciNumber + " ");
                firstElement = secondElement;
                secondElement = fibonacciNumber;

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
