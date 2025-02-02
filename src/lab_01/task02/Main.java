package lab_01.task02;

public class Main {
    public static void main(String[] args) {
        ConcreteCreator1 cc1 = new ConcreteCreator1();
        ConcreteCreator2 cc2 = new ConcreteCreator2();
        cc1.someOperation();
        cc2.someOperation();
    }
}
