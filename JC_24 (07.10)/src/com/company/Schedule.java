package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Schedule {

    Set<Seance> seances = new HashSet<>();

    void addSeance(Seance seance) {
        seances.add(seance);
    }


    @Override
    public String toString() {
        return
                String.valueOf(seances);
    }
}
