package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarsFromList(List<Car> list, Integer count);

    List<Car> getCarList();

}
