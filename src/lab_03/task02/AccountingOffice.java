package lab_03.task02;

import lab_03.task02.coffeeMachines.AbstractCoffeeMachine;
import lab_03.task02.coffeeMachines.DeLongHiMachine;
import lab_03.task02.coffeeMachines.PhillipsMachine;
import lab_03.task02.coffeeMachines.SiemensMachine;
import lab_03.task02.drinks.Drinks;

public class AccountingOffice {
    static AbstractCoffeeMachine deLongHiMachine = new DeLongHiMachine();
    static AbstractCoffeeMachine siemensMachine = new SiemensMachine();
    static AbstractCoffeeMachine phillipsMachine = new PhillipsMachine();

    static Integer getProfitWithMachine(AbstractCoffeeMachine coffeeMachine, int americanoOrders, int cappuccinoOrders,
                                 int espressoOrders, int latteOrders) {
        int profit = 0;
        Drinks americano = coffeeMachine.makeAmericano();
        Drinks espresso = coffeeMachine.makeEspresso();
        Drinks latte = coffeeMachine.makeLatte();
        Drinks cappuccino = coffeeMachine.makeCappuccino();
        profit += americanoOrders * (americano.getFullPrice() - americano.getProdCost());
        profit += espressoOrders * (espresso.getFullPrice() - espresso.getProdCost());
        profit += latteOrders * (latte.getFullPrice() - latte.getProdCost());
        profit += cappuccinoOrders * (cappuccino.getFullPrice() - cappuccino.getProdCost());
        profit -= coffeeMachine.getPrice();
        profit -= coffeeMachine.getExploitCost() * (americanoOrders + cappuccinoOrders + espressoOrders + latteOrders);
        return profit;
    }

    public static void main(String[] args) {
        int days = 23;
        int americanoOrders = 55 * days;
        int espressoOrders = 65 * days;
        int latteOrders = 50 * days;
        int cappuccinoOrders = 45 * days;
        System.out.println("DeLongHi Machine profit: " + getProfitWithMachine(deLongHiMachine, americanoOrders,
                cappuccinoOrders, espressoOrders, latteOrders));
        System.out.println("Phillips Machine profit: " + getProfitWithMachine(phillipsMachine, americanoOrders,
                cappuccinoOrders, espressoOrders, latteOrders));
        System.out.println("Siemens Machine profit: " + getProfitWithMachine(siemensMachine, americanoOrders,
                cappuccinoOrders, espressoOrders, latteOrders));
    }
}
