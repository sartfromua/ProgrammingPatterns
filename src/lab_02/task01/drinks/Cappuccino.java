package lab_02.task01.drinks;

import java.util.List;

public class Cappuccino implements Drinks {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino");
    }

    @Override
    public int getProdCost() {
        return 25;
    }

    @Override
    public int getFullPrice() {
        return 55;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Milk", "Water", "Coffee");
    }
}
