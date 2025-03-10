package lab_14.task03;

public class BaseEquationHandler implements EquationHandler {
	EquationHandler next;

	@Override
	public void setNext(EquationHandler next) {
		this.next = next;
	}

	@Override
	public double solve(int a, int b, String operator) {
		return (next == null) ? null : next.solve(a, b, operator);
	}
}
