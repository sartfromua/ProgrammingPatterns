package lab_05.task02.parts;

public class Transmission implements Prototype {
    public Transmission(Type type, int gearsNumber) {
        this.type = type;
        this.gearsNumber = gearsNumber;
    }

    protected Transmission(Transmission other) {
        this.type = other.type;
        this.gearsNumber = other.gearsNumber;
    }

    @Override
    public Transmission clone() {
        return new Transmission(this);
    }

    public enum Type {
        AUTOMATIC, MECHANICAL
    }
    private final Type type;
    private final int gearsNumber;
}
