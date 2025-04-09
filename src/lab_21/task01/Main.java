package lab_21.task01;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setPaymentMethod(new PayPalPaymentMethod());
    customer.makePayment(100);

    customer.setPaymentMethod(new BankAccountPaymentMethod());
    customer.makePayment(200);

    customer.setPaymentMethod(new CryptoValletPaymentMethod());
    customer.makePayment(30000);

  }

}
