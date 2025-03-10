package lab_14.task02;

public interface Handler {
	void setNext(Handler next);
	void openFile(String file);
}
