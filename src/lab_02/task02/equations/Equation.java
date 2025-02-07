package lab_02.task02.equations;

import java.util.List;

public class Equation {
    Double b;
    Double c;

    public void printEquation() {
        String line = String.format("%.1f*x + %.1f = 0\n", b, c);
        System.out.printf(line);
    }

    public Equation(List<Double> coefficients) {
        b = coefficients.get(0);
        c = coefficients.get(1);
    }

    public List<Double> solve() {
        if (c == 0 && b == 0) return null;
        if (b==0) return List.of();
        return List.of(-this.c/this.b);
    }
}
