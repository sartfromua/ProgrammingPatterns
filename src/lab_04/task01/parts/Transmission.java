package lab_04.task01.parts;

public class Transmission {
    public Transmission(Type type, int gearsNumber) {
        this.type = type;
        this.gearsNumber = gearsNumber;
    }

    public enum Type {
        AUTOMATIC, MECHANICAL
    }
    private final Type type;
    private final int gearsNumber;
}
