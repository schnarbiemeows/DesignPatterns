package main;

import classes.PartRepository;
import interfaces.Iterator;

/**
 * @author dylan
 *
 */
public class IteratorPatternMain {

	/**
	 * * Behavioral pattern provides a standard way to iterate through the elements
	 * of a Collection without needing to know about the Collection's underlying
	 * structure
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] parts = { "watch", "spring", "sprocket", "actuator", "nut", "bolt" };
		PartRepository warehouse = new PartRepository(parts);
		Iterator availableParts = warehouse.getIterator();
		System.out.println("Welcome to the warehouse! The parts we have available are:");
		while (availableParts.hasNext()) {
			String item = (String) availableParts.next();
			System.out.println(item);
		}
	}

}
