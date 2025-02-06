package lab_02.task02.equations;

import lab_02.task02.equations.Equation;

import java.util.List;

public class LinearEquation implements Equation {
    List<Double> coefficients;

    @Override
    public void printEquation() {
        String line = String.format("%.1f*x + %.1f = 0\n", coefficients.get(0), coefficients.get(1));
        System.out.printf(line);
    }

    public LinearEquation(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    public List<Double> solve() {
        if (coefficients.size() == 2 && coefficients.get(0) == 0 && coefficients.get(1) == 0) return null;
        Double b = coefficients.get(0);
        Double c = coefficients.get(1);
        return List.of(-c/b);
    }
}
