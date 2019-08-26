package main;

import classes.SingletonClass;

/**
 * @author dylan
 *
 */
public class SingletonPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingletonClass thisClass = SingletonClass.getInstance();
		System.out.println(thisClass.getValue());
		thisClass.setValue(2);
		System.out.println(thisClass.getValue());
	}

}
