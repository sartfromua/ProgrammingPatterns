package lab_05.task01.equations;

import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends QuadraticEquation {
    Double d;

    public BiQuadraticEquation(List<Double> coefficients) {
        super(coefficients.subList(2, coefficients.size()));
        d = coefficients.getFirst();
    }

    @Override
    public void printEquation() {
        String line = String.format("%.1f*x^4 + %.1f*x^2 + %.1f = 0\n", d, a, c);
        System.out.printf(line);
    }


    protected BiQuadraticEquation(BiQuadraticEquation equation) {
        super(equation);
        d = equation.d;
    }


    @Override
    public List<Double> solve() {
        b = (double) 0;
        if (d == 0) return super.solve();
        b = a;
        a = d;
        List<Double> result = super.solve();
        List<Double> solution = new ArrayList<>();
        for (Double x : result) {
            if (x == 0) solution.add(x);
            if (x > 0) {solution.add(Math.sqrt(x)); solution.add(-Math.sqrt(x));}
        }
        return solution;
    }


    @Override
    public Equation clone() {
        return new BiQuadraticEquation(this);
    }
}
