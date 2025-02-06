package lab_03.task02.drinks;

import java.util.List;

public class Latte implements Drinks {
    @Override
    public void prepare() {
        System.out.println("Preparing Drinks");
    }

    @Override
    public int getProdCost() {
        return 30;
    }

    @Override
    public int getFullPrice() {
        return 65;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Milk", "Water", "Coffee");
    }
}
