package lab_18.task02;

import lab_18.task02.Commands.*;

public class Application {

	static Triangle triangle = new Triangle(3, 3, 3);
	static TriangleCaretaker history = new TriangleCaretaker();

	public void findMinArea() {
		String[] edges = {
				"b",
				"c",
				"a",
				"c",
				"duplicateA",
				"c",
				"duplicateA",
				"duplicateB",
				"duplicateC",
				"b",
				"halfA",
				"duplicateA",
				"duplicateB",
				"duplicateC",
		};

		float[] values = {
				4,
				5,
				4,
				5,
				1, // "duplicateA",
				6,
				1, // "duplicateA",
				1,
				1,
				3,
				1, // "halfA"
				1,1,1
		};

		float S_min = Float.MAX_VALUE;
		for (int index = 0; index < edges.length; index++) {
			switch (edges[index]) {
				case "a":
					SetACommand commandA = new SetACommand(triangle);
					commandA.setSide(values[index]);
					executeCommand(commandA);
					break;
				case "b":
					SetBCommand commandB = new SetBCommand(triangle);
					commandB.setSide(values[index]);
					executeCommand(commandB);
					break;
				case "c":
					SetCCommand commandC = new SetCCommand(triangle);
					commandC.setSide(values[index]);
					executeCommand(commandC);
					break;
				case "duplicateA":
					executeCommand(new DuplicateACommand(triangle));
					break;
				case "duplicateB":
					executeCommand(new DuplicateBCommand(triangle));
					break;
				case "duplicateC":
					executeCommand(new DuplicateCCommand(triangle));
					break;
				case "halfA":
					executeCommand(new HalfACommand(triangle));
					break;
				case "halfB":
					executeCommand(new HalfBCommand(triangle));
					break;
				case "halfC":
					executeCommand(new HalfCCommand(triangle));
					break;

			}

			System.out.println(triangle);
			System.out.println("S = " + triangle.square());
			System.out.println();

			S_min = Math.min(triangle.square(), S_min);
		}
		
		while (triangle.square() != S_min) {
			Command command = history.pop();
			if (command != null) command.undo();
		}

		System.out.println("min S = " + triangle.square());
		System.out.println(triangle);
	}

	private void executeCommand(Command command) {
		if (command.execute()) history.push(command);
	}

}
