package lab_03.task02.coffeeMachines;

import lab_03.task02.drinks.Drinks;

public interface AbstractCoffeeMachine {
    Integer getPrice();
    Integer getExploitCost();

    Drinks makeEspresso();
    Drinks makeCappuccino();
    Drinks makeLatte();
    Drinks makeAmericano();
}
