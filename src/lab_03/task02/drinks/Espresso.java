package lab_03.task02.drinks;

import java.util.List;

public class Espresso implements Drinks {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso");
    }

    @Override
    public int getProdCost() {
        return 15;
    }

    @Override
    public int getFullPrice() {
        return 30;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Water", "Coffee");
    }
}
