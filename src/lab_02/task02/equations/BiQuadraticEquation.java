package lab_02.task02.equations;

import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends QuadraticEquation {
    Double b = (double) 0;
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

    @Override
    public List<Double> solve() {
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
}
