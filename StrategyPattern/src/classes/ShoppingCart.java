package classes;

import interfaces.Payment;

/**
 * @author dylan
 *
 */
public class ShoppingCart {

	private int price = 50;

	/**
	 * @param paymentMethod
	 */
	public void buyItem(Payment paymentMethod) {
		paymentMethod.makePayment(price);
	}
}
