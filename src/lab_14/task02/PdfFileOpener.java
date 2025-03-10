package lab_14.task02;

public class PdfFileOpener extends BaseFileHandler {

	@Override
	public void openFile(String file) {
		if (file.endsWith(".pdf")) {
			System.out.println("Opening " + file + " using a Chrome");
		} else super.openFile(file);
	}
}
