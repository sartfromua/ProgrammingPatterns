package lab_21.task02;

public class  Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] operators = {"+", "-", "*", "+", "-", "*", "+", "+", "-"};
        double result = numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
			switch (operators[i]) {
				case "+" -> calculator.setOperation(new AddOperation());
				case "-" -> calculator.setOperation(new SubstructOperation());
				case "*" -> calculator.setOperation(new MultiplyOperation());
			}
            result = calculator.calculate(result, numbers[i+1]);
        }
        System.out.println(result);
    }

}
