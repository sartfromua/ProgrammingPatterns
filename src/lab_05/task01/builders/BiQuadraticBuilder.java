package lab_05.task01.builders;

import lab_05.task01.equations.BiQuadraticEquation;
import lab_05.task01.equations.Equation;

import java.util.List;

public class BiQuadraticBuilder implements EquationBuilder {

    @Override
    public Equation buildEquation(List<Double> coefs) {
        return new BiQuadraticEquation(coefs);
    }

}
