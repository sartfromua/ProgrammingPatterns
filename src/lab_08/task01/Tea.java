package lab_08.task01;

public class Tea extends Beverage {

    public Tea(int sugar, Toppings toppings) {
        super(sugar, toppings);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
        super.prepare();

    }

    @Override
    public int cost() {
        return 7 + toppings.getCost();
    }

    @Override
    public void drink() {
        System.out.printf("\nDrinking Tea %s!", toppings);
    }
}
