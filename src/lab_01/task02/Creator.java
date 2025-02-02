package lab_01.task02;

public class Creator {
    public Product createProduct() {
        return new Product1();
    }

    public void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }
}
