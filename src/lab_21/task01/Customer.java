package lab_21.task01;

public class Customer {

  private PaymentMethod paymentMethod;

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void makePayment(int amount) {
    paymentMethod.pay(amount);
  }


}
