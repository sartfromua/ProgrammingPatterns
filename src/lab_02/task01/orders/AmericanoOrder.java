package lab_02.task01.orders;

import lab_02.task01.drinks.Americano;
import lab_02.task01.drinks.Drinks;

public class AmericanoOrder implements DrinksOrder {
    @Override
    public Drinks getDrinks() {
        return new Americano();
    }
}
