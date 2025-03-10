package lab_15.task03;

import lab_15.task02.commands.Command;
import lab_15.task03.commands.*;

public class TVSimulator {
    public static void main(String[] args) {

//        Device tv = new Television();
        Device tv = new Radio();

        RemoteController controller = getRemoteController();



        controller.deviceOn(tv);

        for (int i = 0; i < 30; i++) {
            controller.deviceNextChanel(tv);
        }
        controller.deviceVolumeUp(tv);

        controller.deviceVolumeUp(tv);
        controller.deviceVolumeUp(tv);

        controller.devicePrevChanel(tv);

        controller.deviceVolumeDown(tv);

        controller.deviceOff(tv);

    }

    private static RemoteController getRemoteController() {
        RemoteController controller = new RemoteController();

        controller.setDeviceOnCommand(new DeviceOnCommand());
        controller.setDeviceOffCommand(new DeviceOffCommand());
        controller.setDevicePrevChanelCommand(new DevicePrevChanelCommand());
        controller.setDeviceNextChanelCommand(new DeviceNextChanelCommand());
        controller.setDeviceVolumeDownCommand(new DeviceVolumeDownCommand());
        controller.setDeviceVolumeUpCommand(new DeviceVolumeUpCommand());
        return controller;
    }
}
