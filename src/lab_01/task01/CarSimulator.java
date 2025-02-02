package lab_01.task01;

public class CarSimulator {
    Car car;
    CarBuilder builder;

    public CarSimulator(Car car, CarBuilder builder) {
        this.car = car;
        this.builder = builder;
    }

    public void go() {
        Car car = this.builder.makeCar(this.car.wheel, this.car.engine, this.car.manufacturer);
        System.out.println(car + "made by " + builder);
    }
}
