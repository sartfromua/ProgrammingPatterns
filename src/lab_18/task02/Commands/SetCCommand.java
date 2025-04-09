package lab_18.task02.Commands;

import lab_18.task02.Triangle;

public class SetCCommand extends Command {
	private float side;
	public SetCCommand(Triangle triangle) {
		super(triangle);
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public boolean execute() {
		backUp();
		this.triangle.setC(side);
		return true;
	}
}
