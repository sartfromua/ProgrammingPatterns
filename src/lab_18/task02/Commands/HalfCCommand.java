package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public class HalfCCommand extends Command {
	public HalfCCommand(Triangle triangle) {
		super(triangle);
	}

	@Override
	public boolean execute() {
		backUp();
		this.triangle.halfC();
		return true;
	}
}
