package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = 0;



        boolean isValid = false;

        while(!isValid) {
            System.out.println("Please enter number");
            if (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    number1 = scan.nextInt();
                    isValid = true;

                } else {
                    scan.next();
                    System.out.println("Please enter an integer");
                }

                if (number1 % 2 == 0)
                    System.out.println("Number is even");
                else
                System.out.println("Number is odd");

            }
        }}}

