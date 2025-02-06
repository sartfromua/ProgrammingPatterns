package lab_02.task01.orders;

import lab_02.task01.drinks.Cappuccino;
import lab_02.task01.drinks.Drinks;

public class CappuccinoOrder implements DrinksOrder {

    @Override
    public Drinks getDrinks() {
        return new Cappuccino();
    }
}
