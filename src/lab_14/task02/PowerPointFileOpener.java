package lab_14.task02;

public class PowerPointFileOpener  extends BaseFileHandler {

	@Override
	public void openFile(String file) {
		if (file.endsWith(".ppt") || file.endsWith(".pptx")) {
			System.out.println("Opening " + file + " using a PowerPoint");
		} else super.openFile(file);
	}
}