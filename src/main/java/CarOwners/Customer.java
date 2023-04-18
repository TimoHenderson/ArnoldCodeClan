package CarOwners;

import Cars.Car;

import java.util.ArrayList;

public class Customer extends CarOwner {

    public Customer(int money) {
        super(money);
    }

    public Customer(int money, ArrayList<Car> cars) {
        super(money, cars);
    }
}
