package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menuValue = 0;
        String month = null;

        System.out.println("List of the functions that you can use:");
        System.out.println("1. Сheck if there is a specified month\n" +
                "2. Display all months that have the same season\n" +
                "3. Display all month that have the same number of days\n" +
                "4. Display all month that have less number of days\n" +
                "5. Display all month that have more number of days\n" +
                "6. Display next season\n" +
                "7. Display previous season\n" +
                "8. Display all month that have an even number of days\n" +
                "9. Display all month that have an odd number of days\n" +
                "10. Display if the month have an even number of days");


        try {

            boolean isValid = false;
            System.out.println("Choice menu option:");

            while (!isValid) {
                if (scan.hasNextInt()) {
                    menuValue = scan.nextInt();
                    isValid = true;
                } else {
                    scan.next();
                    System.out.println("Please enter integer values");
                }
            }

            System.out.println("Print month:");
            scan.nextLine();
            if (scan.hasNextLine()) {
                month = scan.nextLine();
                scan.close();
            }

            if (isStringContainsLatinCharactersOnly(month)) {
                monthCheck(menuValue, month);
            } else throw new WrongInputConsoleParametersException("Only character from Latin alfabet", month);
        } catch (WrongInputConsoleParametersException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }


    }

    public static boolean isStringContainsLatinCharactersOnly(final String iStringToCheck) {
        return iStringToCheck.matches("^[a-zA-Z]+$");
    }


    public static void monthCheck(int menuValue, String month) {
        boolean checkMonth = false;
        int day = 0;
        int seasonValue = 0;


        switch (menuValue) {

            //Сheck if there is a specified month of year
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

            //Find and print all months that have the same season of year
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

            //Find and print all months that have the same number of days
            case 3:
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

            //Find and print all month that have less numbers of day then entered month
            case 4:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }

                System.out.println("List of month that have less " + day + " day of month:");
                for (Month m : Month.values()) {
                    if (m.getDay() < day) {
                        System.out.println(m.toString());
                    }
                }
                break;

            //Find and print all month that have more numbers of day then entered month
            case 5:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }

                System.out.println("List of month that have more " + day + " day of month:");
                for (Month m : Month.values()) {
                    if (m.getDay() > day) {
                        System.out.println(m.toString());
                    }
                }
                break;

            // Find and print next season of year
            case 6:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        seasonValue = m.season.ordinal();

                        Season[] seasons = Season.values();
                        if (m.season.ordinal() == 3) {
                            System.out.println(Season.WINTER);
                        } else
                            System.out.println(seasons[seasonValue + 1]);

                    }
                }
                break;

            // Find and print previous season of year
            case 7:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        seasonValue = m.season.ordinal();

                        Season[] seasons = Season.values();
                        if (m.season.ordinal() == 0) {
                            System.out.println(Season.AUTUMN);
                        } else
                            System.out.println(seasons[seasonValue - 1]);

                    }
                }
                break;

            // Check and print all month which have an even number of days\n"
            case 8:
                System.out.println("List of month that have even numbers of day: ");
                for (Month m : Month.values()) {
                    if (m.getDay() % 2 == 0) {
                        System.out.println(m.toString());
                    }
                }
                break;

            // Check and print all month which have an odd number of days
            case 9:
                System.out.println("List of month that have odd numbers of day: ");
                for (Month m : Month.values()) {
                    if (m.getDay() % 2 != 0) {
                        System.out.println(m.toString());
                    }
                }
                break;

            //Check if the month have an even number of days or not
            case 10:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }
                if (day % 2 == 0) {
                    System.out.println("Month " + month.toUpperCase() + " have an even number of days");
                } else
                    System.out.println("Month " + month.toUpperCase() + " have an odd number of days");

                break;
        }
    }

}
