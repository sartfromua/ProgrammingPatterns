package lab_18.task01_2;

public record MementoTriangle(float a, float b, float c) implements Memento {


	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}
	public float getC() {
		return c;
	}
}
