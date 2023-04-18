package Cars;

import CarParts.Gearbox;
import CarParts.PetrolEngine;
import CarParts.Wheels;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar car;
    PetrolEngine engine;
    Gearbox gearbox;
    Wheels wheels;

    @Before
    public void setUp() {
        engine = new PetrolEngine("12345");
        gearbox = new Gearbox("23456");
        wheels = new Wheels("34567");
        car = new PetrolCar(engine, gearbox, wheels, "Red", 10000);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasGearBox() {
        assertEquals(gearbox, car.getGearbox());
    }

    @Test
    public void hasWheels() {
        assertEquals(wheels, car.getWheels());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(10000, car.price());
    }

    @Test
    public void canAddDamage() {
        car.damage(1000);
        assertEquals(9000, car.price());
    }

    @Test
    public void canRepair() {
        car.damage(1000);
        assertEquals(9000, car.price());
        car.repair();
        assertEquals(10000, car.price());
    }
}
