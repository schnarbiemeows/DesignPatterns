package main;

import classes.Watch;
import classes.WatchVisitor;

/**
 * @author dylan
 *
 */
public class VisitorPatternMain {
	/**
	 * Behavioral pattern
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Watch myWatch = new Watch();
		myWatch.acceptVisitor(new WatchVisitor());
	}

}
