package com.company;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Choice option of the list: ");

        System.out.println("1. Print toString.\n" +
                "2. Set releaseDate");

        int choice = scan.nextInt();


        randomSizeOfArray(choice);


    }

    public static void randomSizeOfArray(int choice) {


        int n, m;
        n = (int) (2 + Math.random() * 4);
        m = (int) (2 + Math.random() * 4);


        ArrayList<Car> cars = new ArrayList<>();
        switch (choice) {
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {

                        Car car = new Car(randomHorsePower(), randomReleaseDate(), randomCylinderNumber(),
                                randomHadnlebarDiametr(), randomMaterial());
                        cars.add(car);
                    }
                }
                System.out.println(cars);
                break;

            case 2:

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        Car car = new Car(randomHorsePower(), randomReleaseDate(), randomCylinderNumber(),
                                randomHadnlebarDiametr(), randomMaterial() + "\n");
                        cars.add(car);
                    }
                }
                System.out.println("Before change: \n" + cars);


                for (Car carrs : cars) {
                    carrs.setReleaseDate(randomReleaseDate());
                }


                System.out.println("After change: ");
                System.out.println(cars);
                break;


        }
    }


    public static int randomHorsePower() {
        int horsePower = (int) (85 + Math.random() * 915);

        return horsePower;
    }

    public static int randomReleaseDate() {
        int releaseDate = (int) (2000 + Math.random() * 20);

        return releaseDate;
    }

    public static int randomCylinderNumber() {
        int cylinderNumber = (int) (2 + Math.random() * 6);

        return cylinderNumber;
    }

    public static int randomHadnlebarDiametr() {
        int hadnlebarDiametr = (int) (Math.random() * 12 + 5);
        return hadnlebarDiametr;
    }

    public static String randomMaterial() {
        int random = (int) (Math.random() * 2);

        if (random == 0)
            return "Шкіра";

        return "Алькантара";

    }
}
