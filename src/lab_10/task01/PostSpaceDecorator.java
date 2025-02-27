package lab_10.task01;

public class PostSpaceDecorator extends BaseDecorator {
	PostSpaceDecorator(Printable printable) {
		super(printable);
	}

	@Override
	public void print() {
		super.print();
		System.out.print(" ");
	}
}
