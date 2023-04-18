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

public class DealershipTest {
    Dealership dealership;
    HybridCar hybridCar;

    @Before
    public void setUp() {
        ArrayList<Car> cars = new ArrayList<>();
        hybridCar = new HybridCar(new HybridEngine("1234"), new Gearbox("2345"), new Wheels("23123"), "Yellow", 10000);
        cars.add(hybridCar);
        dealership = new Dealership(20000, cars);
    }

    @Test
    public void hasMoney() {
        assertEquals(20000, dealership.getMoney());
    }

    @Test
    public void hasCars() {
        assertEquals(1, dealership.getNumCars());
    }

    @Test
    public void hasEmptyCarsIfNoneGiven() {
        Dealership dealership1 = new Dealership(30000);
        assertEquals(0, dealership1.getNumCars());
    }

    @Test
    public void canBuyACar() {
        Car car = new PetrolCar(new PetrolEngine("123"), new Gearbox("t3"), new Wheels("56"), "Black", 10000);
        dealership.buyCar(car);
        assertEquals(2, dealership.getNumCars());
        assertEquals(10000, dealership.getMoney());
    }

    @Test
    public void canSellCarToCustomer() {
        Customer customer = new Customer(20000);
        dealership.sellCar(hybridCar, customer);
        assertEquals(0, dealership.getNumCars());
        assertEquals(30000, dealership.getMoney());
        assertEquals(1, customer.getNumCars());
        assertEquals(10000, customer.getMoney());
    }

    @Test
    public void canRepairCars() {
        Car car = new PetrolCar(new PetrolEngine("123"), new Gearbox("t3"), new Wheels("56"), "Black", 10000);
        car.damage(1000);
        assertEquals(9000, car.price());
        ArrayList<Car> cars = new ArrayList<>();
        Dealership dealership = new Dealership(20000, cars);
        dealership.repairCar(car);
        assertEquals(19000, dealership.getMoney());
        assertEquals(10000, car.price());
    }
}

