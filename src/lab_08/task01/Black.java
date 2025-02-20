package lab_08.task01;

public class Black implements Toppings {
    private final int waterVolume;

    Black(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    @Override
    public String getTopping() {
        return  "Hot watter: %s ml".formatted(waterVolume);
    }

    @Override
    public Integer getCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "flat";
    }
}
