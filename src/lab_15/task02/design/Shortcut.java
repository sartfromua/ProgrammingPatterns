package lab_15.task02.design;

import lab_15.task02.commands.Command;
import lab_15.task02.entities.Document;

public class Shortcut {
    Command command;

    public void press(Document document) {
        command.execute(document);
    }

    Shortcut(Command command) {
        this.command = command;
    }
}
