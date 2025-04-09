package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public class DuplicateCCommand extends Command {
	public DuplicateCCommand(Triangle triangle) {
		super(triangle);
	}

	@Override
	public boolean execute() {
		backUp();
		this.triangle.duplicateC();
		return true;
	}
}
