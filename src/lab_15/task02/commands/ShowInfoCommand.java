package lab_15.task02.commands;

import lab_15.task02.entities.Document;

public class ShowInfoCommand implements Command {

	@Override
	public void execute(Document document) {
		document.showInfo();
	}
}
