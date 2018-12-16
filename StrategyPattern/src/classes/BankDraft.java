package classes;

import interfaces.Payment;

public class BankDraft implements Payment {

	@Override
	public void makePayment(int amount) {
		System.out.println("Paying $" + amount + " with a check");
	}

}
