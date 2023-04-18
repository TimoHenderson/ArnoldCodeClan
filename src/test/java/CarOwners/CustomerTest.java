package CarOwners;

import CarParts.Gearbox;
import CarParts.HybridEngine;
import CarParts.PetrolEngine;
import CarParts.Wheels;
import Cars.Car;
import Cars.HybridCar;
import Cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new HybridCar(new HybridEngine("1234"), new Gearbox("2345"), new Wheels("23123"), "Yellow", 10000));

        customer = new Customer(20000, cars);
    }

    @Test
    public void hasMoney() {
        assertEquals(20000, customer.getMoney());
    }

    @Test
    public void hasCars() {
        assertEquals(1, customer.getNumCars());
    }

    @Test
    public void hasEmptyCarsIfNoneGiven() {
        Customer customer1 = new Customer(30000);
        assertEquals(0, customer1.getNumCars());
    }

    @Test
    public void canBuyACar() {
        Car car = new PetrolCar(new PetrolEngine("123"), new Gearbox("t3"), new Wheels("56"), "Black", 10000);
        customer.buyCar(car);
        assertEquals(2, customer.getNumCars());
        assertEquals(10000, customer.getMoney());
    }
}
