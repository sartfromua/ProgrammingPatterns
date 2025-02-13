package lab_05.task02;

import lab_05.task02.parts.*;

public class Car implements Prototype {
    private final Body body;
    private final Engine engine;
    private final Transmission transmission;
    private final Wheel wheel;

    public Car(Body body, Engine engine, Transmission transmission, Wheel wheel) {
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" + "\nbody=" + body + ", \nengine=" + engine +
                ", \ntransmission=" + transmission + ", \nwheel=" + wheel + "\n}";
    }

    protected Car(Car other) {
        this.body = other.body.clone();
        this.engine = other.engine.clone();
        this.transmission = other.transmission.clone();
        this.wheel = other.wheel.clone();
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
