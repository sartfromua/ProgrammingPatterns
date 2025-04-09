package lab_18.task02;

import lab_18.task02.Commands.Command;

import java.util.Stack;

public class TriangleCaretaker {
	final Stack<Command> history = new Stack<>();

	public void push(Command command) {
		history.push(command);
	}

	public Command pop() {
		if (history.isEmpty()) return null;
		return history.pop();
	}

}
