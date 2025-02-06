package lab_02.task02.builders;

import lab_02.task02.equations.Equation;
import lab_02.task02.equations.LinearEquation;

import java.util.List;

public class LinearEquationBuilder implements EquationBuilder{

    @Override
    public Equation buildEquation(List<Double> coefs) {
        return new LinearEquation(coefs);
    }
}
