package lab_10.task01;

public class PrintableString implements Printable {
	protected String line;

	PrintableString(String line) {
		this.line = line;
	}

	@Override
	public void print() {
		System.out.print(line);
	}
}
