package lab_14.task03;

public class DivisionEquationHandler extends BaseEquationHandler {

	@Override
	public double solve(int a, int b, String operator) {
		return operator.equals("/") ? (double) a /  b : next.solve(a, b, operator);
	}
}
