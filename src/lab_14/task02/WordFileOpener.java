package lab_14.task02;

public class WordFileOpener extends BaseFileHandler {

	@Override
	public void openFile(String file) {
		if (file.endsWith(".doc") || file.endsWith(".docx")) {
			System.out.println("Opening " + file + " using a Word");
		} else super.openFile(file);
	}
}
