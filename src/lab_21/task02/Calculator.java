package lab_21.task02;

public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        return operation.calculate(a, b);
    }
}
