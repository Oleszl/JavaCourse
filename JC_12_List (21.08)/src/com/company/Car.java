package com.company;

public class Car {
    private int horsePowerNumber;
    private int releaseDate;

   private Handlebar handlebar;
   private Engine engine;

    public Car(int horsePowerNumber, int releaseDate,int cylinderNumber,int hadnlebarDiametr, String material) {
        this.horsePowerNumber = horsePowerNumber;
        this.releaseDate = releaseDate;
        this.engine = new Engine(cylinderNumber);
        this.handlebar = new Handlebar(hadnlebarDiametr,material);

    }

    public void setHorsePowerNumber(int horsePowerNumber) {
        this.horsePowerNumber = horsePowerNumber;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Car " +
                "horsePowerNumber= " + horsePowerNumber +
                ", releaseDate= " + releaseDate +
                ", engine= " + engine +
                ", handlebar= " + handlebar
                ;
    }
}
