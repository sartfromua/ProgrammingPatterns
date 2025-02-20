package lab_08.task01;

public class Cafe {

    public static void main(String[] args) {
        Chocolate blackChocolate = new Chocolate(3, new Black(200));
        Coffee blackCoffee = new Coffee(3, true, new Black(200));
        Tea blackTea = new Tea(0, new Black(300));

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTea);

        Chocolate milkChocolate = new Chocolate(3, new WithMilk(200));
        Coffee coffeeWithMilk = new Coffee(3, false, new WithMilk(200));
        Tea teeWithMilk = new Tea(2, new WithMilk(300));

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
