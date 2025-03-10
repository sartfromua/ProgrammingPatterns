package lab_14.task02;

public class ExcelFileOpener extends BaseFileHandler {

	@Override
	public void openFile(String file) {
		if (file.endsWith(".xls") || file.endsWith(".xlsx")) {
			System.out.println("Opening " + file + " using an Excel");
		} else super.openFile(file);
	}
}