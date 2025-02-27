package lab_10.task01;

public class PreWordDecorator extends BaseDecorator {
	String preWord;

	PreWordDecorator(Printable printable, String word) {
		super(printable);
		preWord = word;
	}

	@Override
	public void print() {
		System.out.println(preWord);
		super.print();
	}
}
