package lab_05.task02.parts;

public class Engine implements Prototype {
    @Override
    public Engine clone() {
        return new Engine(this);
    }

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


    protected Engine(Engine other) {
        this.power = other.power;
        this.fuelConsumption = other.fuelConsumption;
        this.volume = other.volume;
        this.fuel = other.fuel;
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
