package lab_05.task02.builders;

import lab_05.task02.parts.Engine;

public class EngineBuilder {
    private int power;
    private int fuelConsumption;
    private int volume;
    private Engine.Fuel fuel;

    public EngineBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    public EngineBuilder setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public EngineBuilder setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    public EngineBuilder setFuel(Engine.Fuel fuel) {
        this.fuel = fuel;
        return this;
    }

    public Engine createEngine() {
        return new Engine(power, fuelConsumption, volume, fuel);
    }
}