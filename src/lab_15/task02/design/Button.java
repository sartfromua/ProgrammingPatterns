package lab_15.task02.design;

import lab_15.task02.commands.Command;
import lab_15.task02.entities.Document;

public class Button {
    Command command;

    Button(Command command){
        this.command = command;
    }

    public void click(Document document){
        command.execute(document);
    }


}
