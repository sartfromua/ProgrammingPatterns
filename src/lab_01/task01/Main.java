package lab_01.task01;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(350, 30),
                          new Wheel(40, "Steel"), "Benz");
        CarBuilder builder = new CarBuilder();
        CarSimulator simulator = new CarSimulator(car, builder);
        simulator.go();
    }
}
