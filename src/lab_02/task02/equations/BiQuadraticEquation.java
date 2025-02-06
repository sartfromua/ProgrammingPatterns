package lab_02.task02.equations;

import lab_02.task02.equations.Equation;

import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation implements Equation {
    List<Double> coefficients;

    public BiQuadraticEquation(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public void printEquation() {
        String line = String.format("%.1f*x^4 + %.1f*x^2 + %.1f = 0\n", coefficients.get(0), coefficients.get(2), coefficients.get(4));
        System.out.printf(line);
    }

    @Override
    public List<Double> solve() {
        if (coefficients.size() == 3 && coefficients.get(0) == 0 && coefficients.get(1) == 0 &&
                coefficients.get(2) == 0) return null;
        Double a = coefficients.get(0);
        Double b = coefficients.get(2);
        Double c = coefficients.get(4);
        Double D = b*b - 4*a*c;
        List<Double> result;
        if (D < 0) return new ArrayList<Double>();
        if (D == 0) result = List.of(Math.sqrt(-b/2/a));
        else result = List.of((-b + Math.sqrt(D))/2/a, (-b - Math.sqrt(D))/2/a);
        List<Double> solution = new ArrayList<>();
        for (Double x : result) {
            if (x == 0) solution.add(x);
            if (x > 0) {solution.add(Math.sqrt(x)); solution.add(-Math.sqrt(x));}
        }
        return solution;
    }
}
