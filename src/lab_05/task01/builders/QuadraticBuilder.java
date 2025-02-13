package lab_05.task01.builders;

import lab_05.task01.equations.Equation;
import lab_05.task01.equations.QuadraticEquation;

import java.util.List;

public class QuadraticBuilder implements EquationBuilder {

    @Override
    public Equation buildEquation(List<Double> coefs) {
        return new QuadraticEquation(coefs);
    }
}
