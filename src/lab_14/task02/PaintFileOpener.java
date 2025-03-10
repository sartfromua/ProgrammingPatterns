package lab_14.task02;

public class PaintFileOpener extends BaseFileHandler {

	@Override
	public void openFile(String file) {
		if (file.endsWith(".png") || file.endsWith(".jpg")) {
			System.out.println("Opening " + file + " using a Paint");
		} else super.openFile(file);
	}
}