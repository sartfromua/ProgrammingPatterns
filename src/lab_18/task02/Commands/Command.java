package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public abstract class Command {
	protected Triangle triangle;
	protected Triangle.Memento memento;

	public Command(Triangle triangle) {
		this.triangle = triangle;
	}

	public void backUp() {
		memento = triangle.save();
	}

	public void undo() {
		triangle.restore(memento);
	}

	public abstract boolean execute();
}
