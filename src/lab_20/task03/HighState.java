package lab_20.task03;

public class HighState implements State {
	private final Fan fan;

	HighState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void turnUp() {

	}

	@Override
	public void turnDown() {
		fan.setState(new MediumState(fan));
		System.out.println("Fan is on medium");
	}
}
