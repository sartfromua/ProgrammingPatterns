package lab_02.task01.drinks;

import java.util.Arrays;
import java.util.List;

public class Americano implements Drinks {

    @Override
    public void prepare() {
        System.out.println("Preparing Americano");
    }

    @Override
    public int getProdCost() {
        return 20;
    }

    @Override
    public int getFullPrice() {
        return 40;
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("Water", "Coffee");
    }
}
