package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public class DuplicateBCommand extends Command {
	public DuplicateBCommand(Triangle triangle) {
		super(triangle);
	}

	@Override
	public boolean execute() {
		backUp();
		this.triangle.duplicateB();
		return true;
	}
}
