package lab_21.task01;

public class PayPalPaymentMethod implements PaymentMethod {
	@Override
	public void pay(int amount) {
		System.out.println("Payment of $" + amount + " made using PayPal.");
	}
}
