package com.example.cars.controller;
import com.example.cars.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CarsController {

    @GetMapping("/")
    public String addCar(){
        return "add";
    }

    @GetMapping ("/add")
    public String addCar(@ModelAttribute Car car, ModelMap modelMap){
            modelMap.put("car", car);
            return "show";
    }

    @GetMapping("/all")
    public String allCars(ModelMap modelMap){
        modelMap.put("cars", Car.findAll());
        return "all";
    }


}
