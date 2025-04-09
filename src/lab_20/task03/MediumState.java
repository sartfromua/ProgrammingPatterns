package lab_20.task03;

public class MediumState implements State {
	private final Fan fan;

	MediumState(Fan fan) {
		this.fan = fan;
	}
	@Override
	public void turnUp() {
		fan.setState(new HighState(fan));
		System.out.println("Fan is on high");
	}

	@Override
	public void turnDown() {
		fan.setState(new LowState(fan));
		System.out.println("Fan is on low");
	}
}
