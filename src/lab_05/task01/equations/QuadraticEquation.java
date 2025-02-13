package lab_05.task01.equations;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation extends Equation {
    Double a;

    @Override
    public void printEquation() {
        String line = String.format("%.1f*x^2 + %.1f*x + %.1f = 0\n", a, b, c);
        System.out.printf(line);
    }

    public QuadraticEquation(List<Double> coefficients) {
        super(coefficients.subList(1, coefficients.size()));
        a = coefficients.getFirst();
    }


    protected QuadraticEquation(QuadraticEquation other) {
        super(other);
        a = other.a;
    }


    @Override
    public List<Double> solve() {
        if (a==0) return super.solve();

        double D = b*b - 4*a*c;
        if (D < 0) return new ArrayList<Double>();
        if (D == 0) return List.of(-b/2/a);
        return List.of((Double) (-b + Math.sqrt(D))/2/a, (Double) (-b - Math.sqrt(D))/2/a);
    }

    @Override
    public Equation clone() {
        return new QuadraticEquation(this);
    }
}
