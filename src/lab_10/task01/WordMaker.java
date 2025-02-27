package lab_10.task01;

public class WordMaker {
	public static void main(String[] args) {
		Printable string = new PrintableString("Hello");
		string = new PostComaDecorator(string);
		string = new PostSpaceDecorator(string);
		string = new PostWordDecorator(string, "World");
		string = new PostExclaimDecorator(string);
		string.print();
	}
}
