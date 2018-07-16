package com.example.cars.model;

import java.util.List;

//Dao - data object
public interface CarDao {

    List<Car> findAll();
    void addCar(Car car);
}
