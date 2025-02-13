package lab_05.task02;

import lab_05.task02.builders.Builder;
import lab_05.task02.parts.Engine;
import lab_05.task02.parts.Wheel;

public class Director {
    public enum carType {
        SEDAN, SUV
    }

    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public Car makeCar() {
        Car car = builder.
                setEngine(new Engine(400, 40, 7, Engine.Fuel.DIESEL)).
                setWheel(new Wheel(40, Wheel.Material.STEEL)).
                createCar();
        return car;
    }
}
