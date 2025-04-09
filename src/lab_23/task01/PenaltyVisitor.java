package lab_23.task01;

public class PenaltyVisitor implements Visitor {

	int penalty;

	PenaltyVisitor(int penalty) {
		this.penalty = penalty;
	}

	@Override
	public void visit(Manager manager) {
		manager.setSalary(manager.getSalary() - penalty);
	}

	@Override
	public void visit(SalesPerson salesPerson) {
		salesPerson.setSalary(salesPerson.getSalary()-penalty);
	}
}
