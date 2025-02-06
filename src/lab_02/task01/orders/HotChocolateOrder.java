package lab_02.task01.orders;

import lab_02.task01.drinks.Drinks;
import lab_02.task01.drinks.HotChocolate;

public class HotChocolateOrder implements DrinksOrder {

    @Override
    public Drinks getDrinks() {
        return new HotChocolate();
    }
}
