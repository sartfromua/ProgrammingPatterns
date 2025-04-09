package lab_18.task01_3;

public record MementoTriangle(Triangle triangle, float a, float b, float c) implements Memento {


	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}
	public float getC() {
		return c;
	}

	@Override
	public void restore() {
		triangle.setA(a);
		triangle.setB(b);
		triangle.setC(c);
	}
}
