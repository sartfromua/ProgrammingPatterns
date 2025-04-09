package lab_21.task01;

public class BankAccountPaymentMethod implements PaymentMethod {
	@Override
	public void pay(int amount) {
		System.out.println("Payment of $" + amount + " made from bank account.");
	}
}
