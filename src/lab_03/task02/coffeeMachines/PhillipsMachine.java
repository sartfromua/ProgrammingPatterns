package lab_03.task02.coffeeMachines;

import lab_03.task02.drinks.*;


public class PhillipsMachine implements AbstractCoffeeMachine {
    @Override
    public Integer getPrice() {
        return 35000;
    }

    @Override
    public Integer getExploitCost() {
        return 2;
    }

    @Override
    public Drinks makeEspresso() {
        return new Espresso();
    }

    @Override
    public Drinks makeCappuccino() {
        return new Cappuccino();
    }

    @Override
    public Drinks makeLatte() {
        return new Latte();
    }

    @Override
    public Drinks makeAmericano() {
        return new Americano();
    }
}

