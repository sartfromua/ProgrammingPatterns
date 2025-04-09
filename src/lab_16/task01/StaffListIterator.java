package lab_16.task01;

import java.util.*;
import java.util.Iterator;

public class StaffListIterator implements Iterator<Employee> {

	private List<Employee> employees;
	private int index = 0;

	public StaffListIterator(StaffList collection) {
		employees = new ArrayList<>(collection.getElements());
		Collections.sort(employees, Comparator.comparing(Employee::getName));
	}

	@Override
	public boolean hasNext() {
		return index < employees.size();
	}

	@Override
	public Employee next() {
		return employees.get(index++);
	}
}
