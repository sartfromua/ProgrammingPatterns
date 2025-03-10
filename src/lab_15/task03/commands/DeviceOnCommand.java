package lab_15.task03.commands;

import lab_15.task03.Device;

public class DeviceOnCommand implements DeviceCommand {
	@Override
	public void execute(Device device) {
		device.on();
	}
}
