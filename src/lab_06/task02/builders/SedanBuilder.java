package lab_06.task02.builders;

import lab_06.task02.Car;
import lab_06.task02.parts.Body;
import lab_06.task02.parts.Engine;
import lab_06.task02.parts.Transmission;
import lab_06.task02.parts.Wheel;

public class SedanBuilder implements Builder {
    private Body body = new Body(Body.Type.SEDAN, Body.Color.WHITE);
    private Engine engine;
    private Transmission transmission = new Transmission(Transmission.Type.AUTOMATIC, 7);
    private Wheel wheel;

    @Override
    public Builder setBody(Body body) {
        this.body = body;
        return this;
    }

    public Builder setBodyColor(Body.Color color) {
        this.body = new Body(Body.Type.SEDAN, color);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    @Override
    public Car createCar() {
        return new Car(body, engine, transmission, wheel);
    }
}
