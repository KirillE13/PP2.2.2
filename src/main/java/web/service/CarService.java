package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars();

    public void setCars(List<Car> cars);
}
