package Cars;

import CarParts.ElectricMotor;
import CarParts.Gearbox;
import CarParts.Wheels;

public class ElectricCar extends Car {
    public ElectricCar(ElectricMotor engine, Gearbox gearbox, Wheels wheels, String colour, int price) {
        super(engine, gearbox, wheels, colour, price);
    }
}
