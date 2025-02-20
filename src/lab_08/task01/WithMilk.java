package lab_08.task01;

public class WithMilk implements Toppings {
    private final int milkVolume;

    WithMilk(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    @Override
    public String getTopping() {
        return "Milk: %d ml".formatted(milkVolume);
    }

    @Override
    public Integer getCost() {
        return (int) (milkVolume / 20.0);
    }

    @Override
    public String toString() {
        return "with Milk";
    }
}
