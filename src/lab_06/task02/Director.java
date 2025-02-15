package lab_06.task02;

import lab_06.task01.FileProvider;
import lab_06.task02.builders.Builder;
import lab_06.task02.parts.Engine;
import lab_06.task02.parts.Wheel;

import java.util.concurrent.locks.ReentrantLock;

public class Director {
    public enum carType {
        SEDAN, SUV
    }

    private Builder builder;
    private static Director instance;
    private static ReentrantLock mutex = new ReentrantLock();

    private Director() {}

    public static Director getDirector() {
        if (instance == null) {
            mutex.lock();
            if (instance == null) instance = new Director();
            mutex.unlock();
        }
        return instance;
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
