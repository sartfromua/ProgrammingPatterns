package lab_09.task01;

import java.util.ArrayList;
import java.util.List;

public class Director extends SalesTeam {

	private final String name;
	private final int salary;
	private final List<Worker> salesTeams = new ArrayList<>();

	public Director(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void addTeam(SalesTeam salesTeam) {
		salesTeams.add(salesTeam);
	}

	@Override
	public int payExpenses() {
		int total = 0;
		System.out.println(name + " has been paid $" + salary);
		for (Worker salesTeam : salesTeams) {
			total += salesTeam.payExpenses();
		}
		System.out.println("All teams have been paid $" + total);
		return total;
	}
}
