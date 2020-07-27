package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x=0;
        int y=0;
        System.out.println("Введіть значення першого числа: ");
        x = scan.nextInt();
        System.out.println("Введіть значення другого числа: ");
        y = scan.nextInt();
        scan.close();

        Evklid(x,y);
        nsk(x,y);
        nsk2(x,y);

    }

    public static int Evklid(int x,int y){


        while (x != y) {
            if (x < y)
                y = y-x;
            else
                x = x-y;
            System.out.println("x: " + x + " y: " + y);
        }
        return x;
    }

    public static void nsk(int x, int y){

        int nsk = x*y/Evklid(x,y);
        System.out.println("НСК = "+ nsk);

    }

    public static void nsk2(int x,int y){

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int result;

        int multiplication = x * y;

        do {
            result = x % y;
            x = y;
            y = result;
        } while (result != 0);
        int nsk = multiplication / x;

        System.out.print("НСК = " + nsk);
    }


}
