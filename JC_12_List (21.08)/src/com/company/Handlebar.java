package com.company;

public class Handlebar {
    private int hadnlebarDiametr;
    private String material;

    public Handlebar(int hadnlebarDiametr, String material) {
        this.hadnlebarDiametr = hadnlebarDiametr;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Handlebar " +
                "hadnlebarDiametr= " + hadnlebarDiametr +
                ", material= '" + material + '\n' ;
    }
}
