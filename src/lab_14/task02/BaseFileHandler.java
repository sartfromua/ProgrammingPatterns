package lab_14.task02;

public class BaseFileHandler implements Handler {
	Handler next;

	@Override
	public void setNext(Handler next) {
		this.next = next;
	}

	@Override
	public void openFile(String file) {
		if (next != null) next.openFile(file);
	}
}
