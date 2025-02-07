package lab_04.task01.parts;


public class Body {
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

    @Override
    public String toString() {
        return "Body{" +
                "type=" + type +
                ", color=" + color +
                '}';
    }
}
