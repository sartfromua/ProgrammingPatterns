package lab_14.task03;

public interface EquationHandler {
	void setNext(EquationHandler next);
	double solve(int a, int b, String operator);
}
