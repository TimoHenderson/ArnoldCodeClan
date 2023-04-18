package Cars;

import CarParts.ElectricMotor;
import CarParts.Gearbox;
import CarParts.Wheels;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar car;
    ElectricMotor engine;
    Gearbox gearbox;
    Wheels wheels;

    @Before
    public void setUp() {
        engine = new ElectricMotor("12345");
        gearbox = new Gearbox("23456");
        wheels = new Wheels("34567");
        car = new ElectricCar(engine, gearbox, wheels, "Red", 10000);
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
