package lab_06.task02.builders;

import lab_06.task02.Car;
import lab_06.task02.parts.Body;
import lab_06.task02.parts.Engine;
import lab_06.task02.parts.Transmission;
import lab_06.task02.parts.Wheel;

public interface Builder {
    public Builder setBody(Body body);
    public Builder setEngine(Engine engine);
    public Builder setTransmission(Transmission transmission);
    public Builder setWheel(Wheel wheel);
    public Car createCar();
}
