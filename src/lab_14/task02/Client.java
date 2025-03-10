package lab_14.task02;

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        Handler fileOpener = new ExcelFileOpener();
        Handler excelOpener = new ExcelFileOpener();
        Handler wordOpener = new WordFileOpener();
        Handler paintOpener = new PaintFileOpener();
        Handler powerPointOpener = new PowerPointFileOpener();
        Handler pdfOpener = new PdfFileOpener();
        fileOpener.setNext(excelOpener);
        excelOpener.setNext(wordOpener);
        wordOpener.setNext(paintOpener);
        paintOpener.setNext(powerPointOpener);
        powerPointOpener.setNext(pdfOpener);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            fileOpener.openFile(file);
        }


    }
}
