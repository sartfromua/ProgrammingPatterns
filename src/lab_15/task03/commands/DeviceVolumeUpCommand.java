package lab_15.task03.commands;

import lab_15.task03.Device;

public class DeviceVolumeUpCommand implements DeviceCommand {
	@Override
	public void execute(Device device) {
		device.volumeUp();
	}
}
