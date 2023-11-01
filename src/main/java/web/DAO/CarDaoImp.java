package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();

        cars.add(new Car("Nissan GT-R", "Japan", 3.8));
        cars.add(new Car("Saab Sonett", "Sweden", 1.7));
        cars.add(new Car("LADA XRAY", "Russia", 1.8));
        cars.add(new Car("Mercedes-Benz W110", "FRG", 1.9));
        cars.add(new Car("Buick Regal", "USA", 4.9));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
