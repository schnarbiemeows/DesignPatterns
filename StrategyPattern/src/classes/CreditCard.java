package classes;

import interfaces.Payment;

/**
 * @author dylan
 *
 */
public class CreditCard implements Payment {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Payment#makePayment(int)
	 */
	@Override
	public void makePayment(int amount) {
		System.out.println("Paying $" + amount + " with a credit card");
	}

}
