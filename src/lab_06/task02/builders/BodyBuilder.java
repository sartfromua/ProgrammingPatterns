package lab_06.task02.builders;

import lab_06.task02.parts.Body;

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