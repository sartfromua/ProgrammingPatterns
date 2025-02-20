package lab_08.task01;

public abstract class Beverage {

    protected final int sugar;
    protected final Toppings toppings;

    public Beverage(int sugar, Toppings toppings) {
        this.sugar = sugar;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.printf("\nPut some %s...", toppings.getTopping());
        if (sugar > 0) System.out.printf("\nPut some Sugar: %d g...", sugar);
    }
    public abstract void drink();
    public abstract int cost();

}
