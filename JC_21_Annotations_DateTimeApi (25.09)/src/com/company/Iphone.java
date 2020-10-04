package com.company;
@СellPhone(OS = "IOS",yearOfCompanyCreation = 2007)
public class Iphone {
    @SaveToFile
    private String model;
    @SaveToFile
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Iphone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
