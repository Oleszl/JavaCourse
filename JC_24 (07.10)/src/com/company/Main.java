package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        showMenu();
        Cinema cinema = new Cinema();
        run(cinema);


    }

    public static void showMenu() {
        System.out.println("List of the functions that you can use:");
        System.out.println("1. Add a movie to the movie library \n" +
                "2. Add a movie session to the schedule\n" +
                "3. Removes the movie from the movie library and schedule\n" +
                "4. Delete a specific movie session on a specific day\n" +
                "5. Exit"
        );
    }

    public static void run(Cinema cinema) {

        int value = 0;

        do {
            Seance seance;
            String title;
            String day;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choice operation that you want to use:");
            value = scanner.nextInt();
            switch (value) {
                case 1:
                    cinema.addMovie(addMovie());
                    break;

                case 2:

                    Movie movie2 = new Movie();
                    System.out.print("Input title of film:");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    for (Movie movie1 : cinema.moviesLibrary) {
                        if (movie1.title.equals(title)) {
                            movie2 = new Movie(movie1.title, movie1.duration);
                        }
                    }

                    seance = new Seance(movie2, addScheduleTime());
                    System.out.println("Input the day of the week when the movie will be added to the session");
                    day = scanner.nextLine();
                    cinema.addSeance(seance, day);
                    break;

                case 3:
                    cinema.removeMovie(addMovie());
                    break;

                case 4:
                    seance = new Seance(addMovie(), addScheduleTime());
                    System.out.println("Input the day of the week when the movie will be deleted from the session");
                    scanner.nextLine();
                    day = scanner.nextLine();
                    cinema.removeSeance(seance, day);
                    break;

            }
        }
        while (value != 10);
    }

    public static Movie addMovie() {
        Time time = new Time();
        String title;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input title of film:");
        title = scanner.nextLine();
        System.out.print("Input duration of film (hour):");
        time.hour = scanner.nextInt();
        System.out.print("Input duration film (min):");
        time.min = scanner.nextInt();

        return new Movie(title, time);
    }

    public static Time addScheduleTime() {
        Time time = new Time();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input schedule time of film (hour):");
        time.hour = scanner.nextInt();
        System.out.print("Input schedule time of film (min):");
        time.min = scanner.nextInt();
        return time;
    }
}
