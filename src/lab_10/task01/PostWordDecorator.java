package lab_10.task01;

public class PostWordDecorator extends BaseDecorator {
	String word;

	PostWordDecorator(Printable printable, String word) {
		super(printable);
		this.word = word;
	}

	@Override
	public void print() {
		super.print();
		System.out.print(word);
	}
}
