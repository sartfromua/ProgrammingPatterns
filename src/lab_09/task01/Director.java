package lab_09.task01;

import java.util.ArrayList;
import java.util.List;

public class Director {

	private final String name;
	private final int salary;
	private final List<SalesTeam> salesTeams = new ArrayList<>();

	public Director(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void addTeam(SalesTeam salesTeam) {
		salesTeams.add(salesTeam);
	}

	public void payExpenses() {
		int total = 0;
		System.out.println(name + " has been paid $" + salary);
		for (SalesTeam salesTeam : salesTeams) {
			total += salesTeam.payExpenses();
		}
		System.out.println("All teams have been paid $" + total);
	}
}
