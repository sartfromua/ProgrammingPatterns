package lab_15.task03;

import lab_15.task02.commands.Command;
import lab_15.task03.commands.*;

public class RemoteController {

    private DeviceCommand onCommand = new DeviceOnCommand();
    private DeviceCommand offCommand = new DeviceOffCommand();
    private DeviceCommand nextChanelCommand = new DeviceNextChanelCommand();
    private DeviceCommand prevChanelCommand = new DevicePrevChanelCommand();
    private DeviceCommand volumeDownCommand = new DeviceVolumeDownCommand();
    private DeviceCommand volumeUpCommand = new DeviceVolumeUpCommand();

    void deviceOn(Device device) {
        onCommand.execute(device);
    }

    void setDeviceOnCommand(DeviceCommand cmd) {
        onCommand = cmd;
    }

    void deviceOff(Device device) {
        offCommand.execute(device);
    }
    void setDeviceOffCommand(DeviceCommand cmd) {
        offCommand = cmd;
    }

    void deviceVolumeUp(Device device) {
        volumeUpCommand.execute(device);
    }
    void setDeviceVolumeUpCommand(DeviceCommand cmd) {
        volumeUpCommand = cmd;
    }

    void deviceVolumeDown(Device device) {
        volumeDownCommand.execute(device);
    }
    void setDeviceVolumeDownCommand(DeviceCommand cmd) {
        volumeDownCommand = cmd;
    }

    void deviceNextChanel(Device device) {
        nextChanelCommand.execute(device);
    }
    void setDeviceNextChanelCommand(DeviceCommand cmd) {
        nextChanelCommand = cmd;
    }

    void devicePrevChanel(Device device) {
        prevChanelCommand.execute(device);
    }
    void setDevicePrevChanelCommand(DeviceCommand cmd) {
        prevChanelCommand = cmd;
    }
}
