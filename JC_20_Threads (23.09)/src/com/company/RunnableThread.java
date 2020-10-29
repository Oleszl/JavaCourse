package com.company;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInput the amount of Fibonacci numbers: ");
        int number = scanner.nextInt();
        try {

            Thread.sleep(1000);
            printReversedFib(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static int f(int n){
        if (n <= 1)
            return n;
        else
            return f(n-1) + f(n-2);
    }
    static void printReversedFib(int x){

        if(x <= 1)
            System.out.print(f(x));
        else{
            System.out.print(f(x) + " ");
            printReversedFib(x-1);
        }
    }
}
