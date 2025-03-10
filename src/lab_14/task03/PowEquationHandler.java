package lab_14.task03;

public class PowEquationHandler extends BaseEquationHandler {

	@Override
	public double solve(int a, int b, String operator) {
		return operator.equals("^") ? Math.pow(a, b) : next.solve(a, b, operator);
	}
}
