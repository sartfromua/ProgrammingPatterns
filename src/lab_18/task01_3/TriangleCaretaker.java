package lab_18.task01_3;

import java.util.Stack;

public class TriangleCaretaker {
	private final Stack<Memento> history = new Stack<>();

	public void pushMemento(Memento memento) {
		history.push(memento);
	}

	public void undo() {
		if (history.isEmpty()) return;
		history.pop().restore();
	}
}
