package lab_20.task03;

public class LowState implements State {
	private final Fan fan;

	LowState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void turnUp() {
		fan.setState(new MediumState(fan));
		System.out.println("Fan is on medium");
	}

	@Override
	public void turnDown() {

	}
}
