package main;

import classes.Watch;
import classes.WatchVisitor;

public class VisitorPatternMain {
	/*
	 * Behavioral pattern
	 * 
	 */
	public static void main(String[] args) {
		
		Watch myWatch = new Watch();
		myWatch.acceptVisitor(new WatchVisitor());
	}

}
