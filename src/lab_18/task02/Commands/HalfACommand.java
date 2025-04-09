package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public class HalfACommand extends Command {
	public HalfACommand(Triangle triangle) {
		super(triangle);
	}

	@Override
	public boolean execute() {
		backUp();
		this.triangle.halfA();
		return true;
	}
}
