package lab_15.task02.design;

import lab_15.task02.commands.Command;
import lab_15.task02.entities.Document;

public class MenuItem {
    private Command command;

    public void select(Document document) {
        command.execute(document);
    }

    MenuItem(Command command) {
        this.command = command;
    }
}
