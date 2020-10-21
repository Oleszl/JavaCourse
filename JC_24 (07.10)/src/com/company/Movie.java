package com.company;

import java.util.Objects;

public class Movie {
    String title;
    Time duration;

    public Movie(String title, Time duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return
                "Movie title: '" + title + '\'' +
                ", duration " + duration ;
    }

    public Movie() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(duration, movie.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}
