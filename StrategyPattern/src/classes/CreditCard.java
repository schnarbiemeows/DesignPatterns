package classes;

import interfaces.Payment;

public class CreditCard implements Payment {

	@Override
	public void makePayment(int amount) {
		System.out.println("Paying $" + amount + " with a credit card");
	}

}
