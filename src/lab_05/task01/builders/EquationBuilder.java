package lab_05.task01.builders;

import lab_05.task01.equations.Equation;

import java.util.List;

public interface EquationBuilder {
    Equation buildEquation(List<Double> coefs);
}
