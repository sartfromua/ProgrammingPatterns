package lab_04.task01.builders;

import lab_04.task01.parts.Transmission;

public class TransmissionBuilder {
    private Transmission.Type type;
    private int gearsNumber;

    public TransmissionBuilder setType(Transmission.Type type) {
        this.type = type;
        return this;
    }

    public TransmissionBuilder setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
        return this;
    }

    public Transmission createTransmission() {
        return new Transmission(type, gearsNumber);
    }
}