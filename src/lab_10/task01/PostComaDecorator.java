package lab_10.task01;

public class PostComaDecorator extends BaseDecorator{

	PostComaDecorator(Printable printable) {
		super(printable);
	}

	@Override
	public void print() {
		printable.print();
		System.out.print(",");
	}
}
