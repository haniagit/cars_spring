package com.example.cars.model;

import java.util.ArrayList;
import java.util.List;

public class CarStaticDao implements CarDao {
    private static List<Car> cars = new ArrayList<>(); //zmienna statyczna jest taka sama dla wszystkich obiektów


    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }
}
