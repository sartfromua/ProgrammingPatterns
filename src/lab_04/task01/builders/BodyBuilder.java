package lab_04.task01.builders;

import lab_04.task01.parts.Body;

public class BodyBuilder {
    private Body.Type type;
    private Body.Color color;

    public BodyBuilder setType(Body.Type type) {
        this.type = type;
        return this;
    }

    public BodyBuilder setColor(Body.Color color) {
        this.color = color;
        return this;
    }

    public Body createBody() {
        return new Body(type, color);
    }
}