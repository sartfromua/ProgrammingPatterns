package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public class HalfBCommand extends Command {
	public HalfBCommand(Triangle triangle) {
		super(triangle);
	}

	@Override
	public boolean execute() {
		backUp();
		this.triangle.halfB();
		return true;
	}
}
