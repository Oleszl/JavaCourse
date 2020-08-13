package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("List of the functions that you can use:");
        System.out.println("1. Сheck if there is a specified month\n" +
                "2. Display all months that have the same season\n" +
                "3. Display all month that have the same number of day\n" +
                "4. Display all month that have less number of day\n" +
                "5. Display all month that have more number of day\n" +
                "6. Display next season\n" +
                "7. Display previous season\n" +
                "8. Display all month that have an even number of days\n" +
                "9. Display all month that have an odd number of days\n" +
                "10. Display if the month have an even number of days\n");

        System.out.print("Choice operation that you want to use:");
        int menuValue = scan.nextInt();

        System.out.print("\nPrint month:");
        String month;
        scan.nextLine();
        month = scan.nextLine();


        monthCheck(menuValue, month);


    }

    public static void monthCheck(int menuValue, String month) {
        boolean checkMonth = false;


        switch (menuValue) {
            case 1:

                for (Month m : Month.values()) {
                    if ((month.equalsIgnoreCase(m.toString()))) {
                        checkMonth = true;
                        break;

                    }

                }

                if (checkMonth) {
                    System.out.println("Month: " + month.toUpperCase() + " exist in list of months");
                } else
                    System.out.println("Month: " + month.toUpperCase() + " not exist in list of months");

                break;

            case 2:
                Season season = null;
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        season = m.getSeason();
                        break;
                    }
                }


                System.out.println("List of " + season + " season:");
                for (Month m : Month.values()) {
                    if ((m.getSeason()).equals(season)) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 3:
                int day = 0;
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }


                System.out.println("List of " + day + " day of month:");
                for (Month m : Month.values()) {
                    if (m.getDay() == day) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 4:

                int day1 = 0;
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day1 = m.getDay();
                        break;
                    }
                }

                System.out.println("List of month that have less " + day1 + " day of month:");
                for (Month m : Month.values()) {
                    if (m.getDay() < day1) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 5:
                int day2 = 0;
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day2 = m.getDay();
                        break;
                    }
                }

                System.out.println("List of month that have more " + day2 + " day of month:");
                for (Month m : Month.values()) {
                    if (m.getDay() > day2) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 6:

                int seasonValue = 0;
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        seasonValue = m.season.ordinal();

                        Season [] seasons = Season.values();
                        if (m.season.ordinal()==3){
                            System.out.println(Season.WINTER);
                        }else
                        System.out.println(seasons[seasonValue+1]);

                    }
                }
                break;
            case 7:
                int seasonValue1 = 0;
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        seasonValue1 = m.season.ordinal();

                        Season [] seasons = Season.values();
                        if (m.season.ordinal()==0){
                            System.out.println(Season.AUTUMN);
                        }else
                            System.out.println(seasons[seasonValue1-1]);

                    }
                }
                break;

            case 8:
                System.out.println("List of month that have even numbers of day: ");
                for (Month m : Month.values()) {
                    if (m.getDay() % 2 == 0) {
                        System.out.println(m.toString());
                    }
                }

            case 9:
                System.out.println("List of month that have odd numbers of day: ");
                for (Month m : Month.values()) {
                    if (m.getDay() % 2 != 0) {
                        System.out.println(m.toString());
                    }
                }

            case 10:
                int day3 = 0;

                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day3 = m.getDay();
                        break;
                    }
                }
                if (day3 % 2 == 0) {
                    System.out.println("Month " + month.toUpperCase() + " have an even number of days");
                } else
                    System.out.println("Month " + month.toUpperCase() + " have an odd number of days");


        }
    }

}
