package lab_21.task02;

public class SubstructOperation implements Operation {
	@Override
	public double calculate(double a, double b) {
		double res = a - b;
		System.out.printf("%s - %s = %s%n", a, b, res);
		return res;
	}
}
