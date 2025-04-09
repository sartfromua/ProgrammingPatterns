package lab_23.task01;

public class IncreaseSalaryVisitor implements Visitor {
	int percent;

	IncreaseSalaryVisitor(int percent) {
		this.percent = percent;
	}

	@Override
	public void visit(Manager manager) {
		manager.setSalary(manager.getSalary()*(100+percent)/100);
	}

	@Override
	public void visit(SalesPerson salesPerson) {
		salesPerson.setSalary(salesPerson.getSalary()*(100+percent)/100);
	}
}
