package lab_10.task01;

public class PostExclaimDecorator extends BaseDecorator {
	PostExclaimDecorator(Printable printable) {
		super(printable);
	}

	@Override
	public void print() {
		super.print();
		System.out.print("!");
	}
}
