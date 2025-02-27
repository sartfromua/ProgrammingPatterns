package lab_10.task01;

public class BaseDecorator implements Printable{
	protected Printable printable;

	BaseDecorator(Printable printable) {
		this.printable = printable;
	}

	@Override
	public void print() {
		printable.print();
	}
}
