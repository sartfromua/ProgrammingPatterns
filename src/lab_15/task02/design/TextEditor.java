package lab_15.task02.design;

import lab_15.task02.commands.PrintCommand;
import lab_15.task02.commands.SaveCommand;
import lab_15.task02.commands.ShowInfoCommand;
import lab_15.task02.entities.Document;

public class TextEditor {

    private Document document;

    final private Button saveButton;
    final private Button printButton;

    final private MenuItem saveMenuItem;
    final private MenuItem printMenuItem;
    final private MenuItem showInfoMenuItem;

    final private Shortcut saveShortcut;
    final private Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button(new SaveCommand());
        printButton = new Button(new PrintCommand());

        saveMenuItem = new MenuItem(new SaveCommand());
        printMenuItem = new MenuItem(new PrintCommand());
        showInfoMenuItem = new MenuItem(new ShowInfoCommand());

        saveShortcut = new Shortcut(new SaveCommand());
        printShortcut = new Shortcut(new PrintCommand());
    }

    public void newDocument(String name) {
        document = new Document(name);
    }

    public void clickSaveButton() {
        saveButton.click(document);
    }

    public void clickPrintButton() {
        printButton.click(document);
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select(document);
    }

    public void selectPrintMenuItem() {
        printMenuItem.select(document);
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select(document);
    }

    public void pressSaveShortcut() {
        saveShortcut.press(document);
    }

    public void pressPrintShortcut() {
        printShortcut.press(document);
    }
}
