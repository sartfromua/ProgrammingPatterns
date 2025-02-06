package lab_02.task02;

import lab_02.task02.equations.Equation;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        EquationFactory calculator = new EquationFactory();
        List<Equation> equations = new ArrayList<>();
        FileReader fileReader = new FileReader("D:\\IdeaProjects\\ProgrammingPatterns\\src\\lab_02\\task02\\input01.txt");
        Scanner input = new Scanner(fileReader);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            List<String> parsedLine = new ArrayList<String>(Arrays.asList(line.split("\\s+")));
            if (parsedLine.getFirst().isEmpty() && parsedLine.size() > 1) {
                parsedLine.remove(0);
            }
            List<Double> coefficients = new ArrayList<>();
            for (String str : parsedLine) {
                coefficients.add(Double.parseDouble(str));
            }

            equations.add(calculator.buildEquation(coefficients));
        }
        fileReader.close();
        for (Equation equation : equations) {
            equation.printEquation();
            System.out.println("Solution: " + equation.solve());
        }

    }
}
