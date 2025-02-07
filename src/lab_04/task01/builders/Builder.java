package lab_04.task01.builders;

import lab_04.task01.Car;
import lab_04.task01.parts.Body;
import lab_04.task01.parts.Engine;
import lab_04.task01.parts.Transmission;
import lab_04.task01.parts.Wheel;

public interface Builder {
    public Builder setBody(Body body);
    public Builder setEngine(Engine engine);
    public Builder setTransmission(Transmission transmission);
    public Builder setWheel(Wheel wheel);
    public Car createCar();
}
