package lab_02.task02.equations;

import lab_02.task02.equations.Equation;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation implements Equation {
    List<Double> coefficients;

    @Override
    public void printEquation() {
        String line = String.format("%.1f*x^2 + %.1f*x + %.1f = 0\n", coefficients.get(0), coefficients.get(1), coefficients.get(2));
        System.out.printf(line);
    }

    public QuadraticEquation(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public List<Double> solve() {
        if (coefficients.size() == 3 && coefficients.get(0) == 0 && coefficients.get(1) == 0 &&
                coefficients.get(2) == 0) return null;
        Double a = coefficients.get(0);
        Double b = coefficients.get(1);
        Double c = coefficients.get(2);
        Double D = b*b - 4*a*c;
        if (D < 0) return new ArrayList<Double>();
        if (D == 0) return List.of(-b/2/a);
        return List.of((Double) (-b + Math.sqrt(D))/2/a, (Double) (-b - Math.sqrt(D))/2/a);
    }
}
