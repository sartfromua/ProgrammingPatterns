package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public class DuplicateACommand extends Command {
	public DuplicateACommand(Triangle triangle) {
		super(triangle);
	}

	@Override
	public boolean execute() {
		backUp();
		this.triangle.duplicateA();
		return true;
	}
}
