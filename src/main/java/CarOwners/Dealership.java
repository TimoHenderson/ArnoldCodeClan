package CarOwners;

import Behaviours.IRepairCars;
import Behaviours.ISellCars;
import Cars.Car;

import java.util.ArrayList;

public class Dealership extends CarOwner implements ISellCars, IRepairCars {

    public Dealership(int money) {
        super(money);
    }

    public Dealership(int money, ArrayList<Car> cars) {
        super(money, cars);
    }

    @Override
    public void sellCar(Car car, Customer customer) {
        if (customer.buyCar(car)) {
            removeCar(car);
            addMoney(car.price());
        }
    }

    @Override
    public void repairCar(Car car) {
        reduceMoney(car.repair());
    }
}
