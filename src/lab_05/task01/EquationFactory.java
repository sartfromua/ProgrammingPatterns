package lab_05.task01;

import lab_05.task01.builders.BiQuadraticBuilder;
import lab_05.task01.builders.EquationBuilder;
import lab_05.task01.builders.LinearEquationBuilder;
import lab_05.task01.builders.QuadraticBuilder;
import lab_05.task01.equations.Equation;

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
