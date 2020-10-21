package com.company;

import java.util.*;

public class Cinema {
    TreeMap<Days, Schedule> shedules = new TreeMap<>();
    ArrayList<Movie> moviesLibrary = new ArrayList<>();

    public void addMovie(Movie movie) {
        moviesLibrary.add(movie);
        showMovies();
    }

    public void showMovies() {
        moviesLibrary.stream().sorted((Comparator.comparing(o -> o.title))).forEach(System.out::println);

    }

    public void addSeance(Seance seance, String day) {
        Schedule schedule = new Schedule();
        schedule.addSeance(seance);
        Days days = Days.valueOf(day);

        shedules.put(days, schedule);
        System.out.println(shedules);
    }

    public void removeMovie(Movie movie) {


        for (Movie movie1 : moviesLibrary) {
            if (movie1.title.contains(movie.title)) {
                moviesLibrary.remove(movie1);
                System.out.println(moviesLibrary);
                break;
            }
        }
    }

    public void removeSeance(Seance seance, String day) {

        Set<Map.Entry<Days, Schedule>> set = shedules.entrySet();

        Iterator<Map.Entry<Days, Schedule>> it = set.iterator();
        Days days = Days.valueOf(day);

        while (it.hasNext()) {
            Map.Entry<Days, Schedule> me = it.next();
            if (me.getValue().toString().contains(seance.toString()) &&
                    me.getKey().toString().contains(days.toString())) {
                it.remove();
                System.out.println(shedules);
                break;

            } else
                System.out.println("Error");

        }

    }
}
