package lab_15.task02.commands;

import lab_15.task02.entities.Document;
import lab_15.task03.Device;

public interface Command {
	void execute(Document document);}
