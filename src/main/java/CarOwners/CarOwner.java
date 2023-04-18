package CarOwners;

import Behaviours.IBuyCars;
import Cars.Car;

import java.util.ArrayList;

public abstract class CarOwner implements IBuyCars {
    private final ArrayList<Car> cars;
    private int money;

    public CarOwner(int money) {
        this.money = money;
        this.cars = new ArrayList<>();
    }

    public CarOwner(int money, ArrayList<Car> cars) {
        this.money = money;
        this.cars = cars;
    }

    public int getMoney() {
        return money;
    }

    public void reduceMoney(int amount) {
        money -= amount;
    }

    public void addMoney(int amount) {
        money += amount;
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public int getNumCars() {
        return cars.size();
    }

    public boolean buyCar(Car car) {
        if (money > car.price()) {
            money -= car.price();
            cars.add(car);
            return true;
        }
        return false;
    }
}
