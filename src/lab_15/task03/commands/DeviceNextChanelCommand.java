package lab_15.task03.commands;

import lab_15.task03.Device;

public class DeviceNextChanelCommand implements DeviceCommand {
	@Override
	public void execute(Device device) {
		device.nextChanel();
	}
}
