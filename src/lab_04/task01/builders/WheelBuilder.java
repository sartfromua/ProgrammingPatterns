package lab_04.task01.builders;

import lab_04.task01.parts.Wheel;

public class WheelBuilder {
    private int size;
    private Wheel.Material material;

    public WheelBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public WheelBuilder setMaterial(Wheel.Material material) {
        this.material = material;
        return this;
    }

    public Wheel createWheel() {
        return new Wheel(size, material);
    }
}