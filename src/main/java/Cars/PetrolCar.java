package Cars;

import CarParts.Gearbox;
import CarParts.PetrolEngine;
import CarParts.Wheels;

public class PetrolCar extends Car {
    public PetrolCar(PetrolEngine engine, Gearbox gearbox, Wheels wheels, String color, int price) {
        super(engine, gearbox, wheels, color, price);
    }
}
