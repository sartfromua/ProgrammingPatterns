package lab_08.task01;

public class Chocolate extends Beverage {

    public Chocolate(int sugar, Toppings toppings) {
        super(sugar, toppings);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        super.prepare();
    }

    @Override
    public int cost() {
        return 15 + toppings.getCost();
    }

    @Override
    public void drink() {
        System.out.printf("\nDrinking Chocolate %s!", toppings);
    }
}
