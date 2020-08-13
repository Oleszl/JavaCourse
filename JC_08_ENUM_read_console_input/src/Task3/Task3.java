package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;


        System.out.println("Please enter numbers");

        if (scan.hasNextInt()) {
            number1 = scan.nextInt();

        }
            if (scan.hasNextInt()) {
                number2 = scan.nextInt();

                System.out.println("Suma =" + (int) (number1 + number2));
            }

        else {
            scan.next();
            System.out.println("Please enter an integer");
        }




    }
}
