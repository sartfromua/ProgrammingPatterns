package lab_05.task02.parts;


public class Body implements Prototype{
    @Override
    public Body clone() {
        return new Body(this);
    }

    public enum Color {
        BLACK, WHITE, GREY, RED, BLUE
    }

    public enum Type {
        SEDAN, SUV, hatchback
    }

    private final Type type;
    private final Color color;


    public Body(Type type, Color color) {
        this.type = type;
        this.color = color;
    }

    protected Body(Body other) {
        type = other.type;
        color = other.color;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type=" + type +
                ", color=" + color +
                '}';
    }
}
