package lab_02.task02.builders;

import lab_02.task02.equations.Equation;

import java.util.List;

public interface EquationBuilder {
    Equation buildEquation(List<Double> coefs);
}
