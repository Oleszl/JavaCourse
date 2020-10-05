package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        showMenu();
        run(new Map());

    }

    public static void showMenu() {
        System.out.println("List of the functions that you can use:");
        System.out.println("1. Add new object in map\n" +
                "2. Delete an element of map by key\n" +
                "3. Delete an element of map by value\n" +
                "4. Display SET of key\n" +
                "5. Display LIST of value\n" +
                "6. Display MAP\n" +
                "7. Exit"
        );

    }

    public static void run(Map map) {

        int value1 = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choice operation that you want to use:");
            value1 = scanner.nextInt();
            switch (value1) {
                case 1:
                    System.out.println("Input key:");
                    int key = scanner.nextInt();
                    System.out.println("Input value:");
                    scanner.nextLine();
                    String value = scanner.nextLine();
                    map.addToMap(key, value);
                    break;

                case 2:
                    System.out.println("Input key:");
                    int key1 = scanner.nextInt();

                    map.deleteByKey(key1);
                    break;
                case 3:
                    System.out.println("Input value:");
                    int value2 = scanner.nextInt();

                    map.deleteByValue(value2);
                    break;
                case 4:
                    System.out.println(map.keySet());
                    break;

                case 5:
                    System.out.println(map.listValue());
                    break;

                case 6:

                    break;

                case 7:
                    break;
            }
        }
        while (value1 != 10);
    }
}
