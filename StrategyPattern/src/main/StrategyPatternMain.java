package main;

import classes.BankDraft;
import classes.CreditCard;
import classes.ShoppingCart;

public class StrategyPatternMain {

	/*
	 * Behavioral Pattern
	 * in this pattern, you have a class with a method, in this case, 
	 * ShoppingCart.pay method. You can dynamically control the actual behavior 
	 * of this pattern at runtime by passing in classes that contain the
	 * specific behavior that you want the method to implement. In this case,
	 * classes CreditCard and BankDraft represent different ways that you want
	 * the ShoppingCart.pay method to pay.
	 */
	public static void main(String[] args) {
		
		ShoppingCart sc = new ShoppingCart();
		sc.buyItem(new CreditCard());
		sc.buyItem(new BankDraft());

	}

}
