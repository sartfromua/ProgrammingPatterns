package lab_02.task01;

import lab_02.task01.drinks.Drinks;
import lab_02.task01.orders.DrinksOrder;

import java.util.ArrayList;


public class Kitchen {
    ArrayList<Drinks> drinks = new ArrayList<>();

    void prepareDrink(DrinksOrder order) {
        Drinks drink = order.getDrinks();
        drink.prepare();
        this.drinks.add(drink);
    }

    int countProfit() {
        int money = 0;
        for (Drinks drink : drinks) {
            money += drink.getFullPrice() - drink.getProdCost();
        }
        return money;
    }
}
