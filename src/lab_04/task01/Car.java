package lab_04.task01;

import lab_04.task01.parts.Body;
import lab_04.task01.parts.Engine;
import lab_04.task01.parts.Transmission;
import lab_04.task01.parts.Wheel;

public class Car {
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
}
