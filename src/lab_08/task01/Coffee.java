package lab_08.task01;

public class Coffee extends Beverage {
    private final boolean extraCoffee;

    public Coffee(int sugar, boolean extraCoffee, Toppings toppings) {
        super(sugar, toppings);
        this.extraCoffee = extraCoffee;
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        if (extraCoffee) System.out.println("Put some extra coffee...");
        super.prepare();
    }

    @Override
    public int cost() {
        return 10 + toppings.getCost();
    }

    @Override
    public void drink() {
        System.out.printf("\nDrinking Coffee %s!", toppings);
    }
}
