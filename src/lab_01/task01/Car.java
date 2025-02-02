package lab_01.task01;

public class Car {
    Engine engine;
    Wheel wheel;
    String manufacturer;

    public Car(Engine engine, Wheel wheel, String manufacturer) {
        this.engine = engine;
        this.wheel = wheel;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" + "engine=" + engine + ", wheel=" + wheel + ", manufacturer=" + manufacturer + '}';
    }
}
