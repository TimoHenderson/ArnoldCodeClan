package Cars;

import CarParts.Gearbox;
import CarParts.HybridEngine;
import CarParts.Wheels;

public class HybridCar extends Car {
    public HybridCar(HybridEngine engine, Gearbox gearbox, Wheels wheels, String colour, int price) {
        super(engine, gearbox, wheels, colour, price);
    }
}
