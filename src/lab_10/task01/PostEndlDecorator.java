package lab_10.task01;

public class PostEndlDecorator extends BaseDecorator {

	PostEndlDecorator(Printable printableString) {
		super(printableString);
	}

	@Override
	public void print() {
		super.print();
		System.out.print("\n");
	}
}
