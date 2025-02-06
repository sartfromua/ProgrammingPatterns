package lab_03.task02.coffeeMachines;


import lab_03.task02.drinks.*;

public class DeLongHiMachine implements AbstractCoffeeMachine {
    @Override
    public Integer getPrice() {
        return 30000;
    }

    @Override
    public Integer getExploitCost() {
        return 1;
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
