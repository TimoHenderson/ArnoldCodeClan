package Cars;

import CarParts.Engine;
import CarParts.Gearbox;
import CarParts.Wheels;

public abstract class Car {
    private final Engine engine;
    private final Gearbox gearbox;
    private final Wheels wheels;
    private final String colour;
    private final int price;
    private int damage = 0;

    public Car(Engine engine, Gearbox gearbox, Wheels wheels, String colour, int price) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.wheels = wheels;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public String getColour() {
        return colour;
    }

    public int price() {
        return price - damage;
    }

    public void damage(int damage) {
        this.damage += damage;
    }

    public int repair() {
        int price = damage;
        damage = 0;
        return price;
    }
}
