package com.example.cars.controller;
import com.example.cars.model.Car;
import com.example.cars.model.CarDao;
import com.example.cars.model.CarStaticDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CarsController {

    private CarDao carDao = new CarStaticDao();

    @GetMapping("/")
    public String addCar(){
        return "add";
    }

    @GetMapping ("/add")
    public String addCar(@ModelAttribute Car car, ModelMap modelMap){
            carDao.addCar(car);
            modelMap.put("car", car);
            return "show";
    }

    @GetMapping("/all")
    public String allCars(ModelMap modelMap){
        modelMap.put("cars", carDao.findAll());
        return "all";
    }


}
