package lab_18.task01;

import java.util.Stack;

public class TriangleCaretaker {
	private Triangle triangle;
	final Stack<Triangle.Memento> history = new Stack<>();

	public TriangleCaretaker(Triangle triangle) {
		this.triangle = triangle;
	}

	public void undo() {
		if (history.isEmpty()) return;
		triangle.restore(history.pop());
	}

	public void setA(float a) {
		history.push(triangle.save());
		triangle.setA(a);
	}

	public void setB(float b) {
		history.push(triangle.save());
		triangle.setB(b);
	}

	public void setC(float c) {
		history.push(triangle.save());
		triangle.setC(c);
	}
}
