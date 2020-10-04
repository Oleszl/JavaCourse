package com.company;

@СellPhone()
public class Xiaomi {

    @SaveToFile
    String model;
    @SaveToFile
    double price;

    public Xiaomi(String model, double price) {
        this.model = model;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Xiaomi{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
