package lab_02.task02.builders;

import lab_02.task02.equations.BiQuadraticEquation;
import lab_02.task02.equations.Equation;

import java.util.List;

public class BiQuadraticBuilder implements EquationBuilder {

    @Override
    public Equation buildEquation(List<Double> coefs) {
        return new BiQuadraticEquation(coefs);
    }

}
