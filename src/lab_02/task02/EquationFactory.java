package lab_02.task02;

import lab_02.task02.builders.BiQuadraticBuilder;
import lab_02.task02.builders.EquationBuilder;
import lab_02.task02.builders.LinearEquationBuilder;
import lab_02.task02.builders.QuadraticBuilder;
import lab_02.task02.equations.Equation;

import java.util.List;

public class EquationFactory {
    EquationBuilder linearBuilder = new LinearEquationBuilder();
    EquationBuilder quadraticBuilder = new QuadraticBuilder();
    EquationBuilder biQuadraticBuilder = new BiQuadraticBuilder();

    public Equation buildEquation(List<Double> coefs) {
        if (coefs.size() == 2) return linearBuilder.buildEquation(coefs);
        else if (coefs.size() == 3) {
            if (coefs.getFirst() == 0) {
                coefs.removeFirst();
                return linearBuilder.buildEquation(coefs);
            }
            return quadraticBuilder.buildEquation(coefs);
        }
        else if (coefs.size() == 5) {
            if (coefs.getFirst() == 0) {
                coefs.removeFirst();
                coefs.removeFirst();
                return quadraticBuilder.buildEquation(coefs);
            }
            return biQuadraticBuilder.buildEquation(coefs);
        }
        return null;
    }
}
