package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, MyException {

        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0;

        System.out.println("Please enter numbers");

        if (scan.hasNextInt()) {
            a = scan.nextInt();

        }
        if (scan.hasNextInt()) {
            b = scan.nextInt();

            Methods m1 = new Methods(a, b);
            System.out.println(m1.suma());
            System.out.println(m1.minus());
            System.out.println(m1.devide());
            System.out.println(m1.multiple());
        } else {
            scan.next();
            System.out.println("Please enter double values");
        }


    }
}

