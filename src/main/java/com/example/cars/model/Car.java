package com.example.cars.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String description;
    private static List<Car> cars = new ArrayList<>(); //zmienna statyczna jest taka sama dla wszystkich obiektów

    public Car() {
        cars.add(this);
    }

    public static List<Car> findAll(){
        return cars;
    }

    public Car(String brand, String model, String description) {
        this(); //wywołanie pustego konstruktora
        this.brand = brand;
        this.model = model;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Car --> " +
                "brand= " + brand +
                ", model= " + model +
                ", description= " + description;
    }

}
