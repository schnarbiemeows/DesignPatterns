package classes;

import interfaces.Payment;

public class ShoppingCart {

	private int price = 50;
	
	public void buyItem(Payment paymentMethod) {
		paymentMethod.makePayment(price);
	}
}
