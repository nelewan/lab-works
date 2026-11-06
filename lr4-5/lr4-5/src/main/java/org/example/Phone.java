package org.example;

class Phone {
    String brand;
    String model;
    double price;

    @Override
    public String toString() {
        return "телефон:" + brand + " " + model
                + ", цена: " + price + " руб.";
    }

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price = price - price * discount / 100;
    }
}
