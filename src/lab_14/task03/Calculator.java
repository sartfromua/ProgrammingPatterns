package lab_14.task03;

public class Calculator {
	public static void main(String[] args) {
		EquationHandler solver = new SumEquationHandler();
		EquationHandler subSolver = new SubtractEquationHandler();
		EquationHandler multiSolver = new MultiplicationEquationHandler();
		EquationHandler divSolver = new DivisionEquationHandler();
		EquationHandler powSolver = new PowEquationHandler();
		solver.setNext(subSolver);
		subSolver.setNext(multiSolver);
		multiSolver.setNext(divSolver);
		divSolver.setNext(powSolver);
		powSolver.setNext(solver);

		System.out.println(solver.solve(10, 2, "+"));
		System.out.println(solver.solve(10, 2, "-"));
		System.out.println(solver.solve(10, 2, "*"));
		System.out.println(solver.solve(9, 2, "/"));
		System.out.println(solver.solve(10, 2, "^"));
	}
}
