package lab_06.task02.parts;

public class Engine {
    public enum Fuel {
        GASOLINE, DIESEL, ELECTRIC
    }

    private final int power;
    private final int fuelConsumption;
    private final int volume;
    private final Fuel fuel;

    public Engine(int power, int fuelConsumption, int volume, Fuel fuel) {
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.volume = volume;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", fuelConsumption=" + fuelConsumption +
                ", volume=" + volume +
                ", fuel=" + fuel +
                '}';
    }
}
