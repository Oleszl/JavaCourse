package com.company;

import java.util.Objects;

public class Seance {
    Movie movie;
    Time startTime;
    Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        Time time = new Time();
        time.hour=startTime.hour+movie.duration.hour;
        time.min=startTime.min+movie.duration.min;
        endTime=time;
    }

    @Override
    public String toString() {
        return
                 movie +
                ", startTime=" + startTime + ", endTime = " + endTime
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance1 = (Seance) o;
        return Objects.equals(movie, seance1.movie) &&
                Objects.equals(startTime, seance1.startTime) &&
                Objects.equals(endTime, seance1.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }
}
