package lab_14.task03;

public class SumEquationHandler extends BaseEquationHandler {

	@Override
	public double solve(int a, int b, String operator) {
		return operator.equals("+") ? a + b : next.solve(a, b, operator);
	}
}
