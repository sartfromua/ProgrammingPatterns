package lab_15.task02;

import lab_15.task02.design.TextEditor;

public class Client {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.newDocument("blank.txt");

        //
        // Testing buttons, menu items, shortcuts...
        //
        textEditor.clickSaveButton();
        textEditor.clickPrintButton();
        textEditor.selectShowInfoMenuItem();
        textEditor.selectPrintMenuItem();
        textEditor.selectSaveMenuItem();
        textEditor.pressSaveShortcut();
        textEditor.pressPrintShortcut();
    }
}
