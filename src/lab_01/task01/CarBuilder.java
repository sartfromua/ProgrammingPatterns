package lab_01.task01;

public class CarBuilder {
    Car makeCar(Wheel wheel, Engine engine, String manufacturer) {
        return new Car(engine, wheel, manufacturer);
    }

    Engine getEngine(Car car) {
        return car.engine;
    }

    Wheel getWheel(Car car) {
        return car.wheel;
    }

    @Override
    public String toString() {
        return "Builder number 1";
    }
}
