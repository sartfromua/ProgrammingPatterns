package lab_05.task01.equations;

import java.util.List;

public class Equation implements Prototype {
    protected Double b;
    protected Double c;

    public void printEquation() {
        String line = String.format("%.1f*x + %.1f = 0\n", b, c);
        System.out.printf(line);
    }

    public Equation(List<Double> coefficients) {
        b = coefficients.get(0);
        c = coefficients.get(1);
    }

    public Equation(Equation other) {
        b = other.b;
        c = other.c;
    }

    public List<Double> solve() {
        if (c == 0 && b == 0) return null;
        if (b==0) return List.of();
        return List.of(-this.c/this.b);
    }

    @Override
    public Equation clone() {
        return new Equation(this);
    }
}
