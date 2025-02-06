package lab_02.task01.drinks;

import java.util.List;

public class HotChocolate implements Drinks{
    @Override
    public void prepare() {
        System.out.println("Preparing HotChocolate");
    }

    @Override
    public int getProdCost() {
        return 40;
    }

    @Override
    public int getFullPrice() {
        return 75;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Chocolate", "Milk");
    }
}
