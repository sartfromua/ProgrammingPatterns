package lab_15.task03;

public class Radio implements Device {

    private int volume;
    private int chanel;
    private boolean isOn;

    public Radio() {
        this.isOn = false;
        this.volume = 50;
        this.chanel = 1;
    }

    @Override
    public void on() {
        if (isOn) {
            return;
        }
        System.out.println("Radio is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) {
            return;
        }
        System.out.println("Radio is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            return;
        }
        volume++;
        System.out.println("Radio = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            return;
        }
        volume--;
        System.out.println("Radio = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) {
            return;
        }
        chanel++;
        System.out.println("Radio = " + chanel);
    }

    @Override
    public void prevChanel() {
        if (!isOn) {
            return;
        }
        chanel--;
        System.out.println("Radio = " + chanel);
    }
}
