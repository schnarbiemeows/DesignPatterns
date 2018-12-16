package main;

import classes.Spring;
import interfaces.Part;

public class ProxyPatternMain {

	/*
	 * Structural pattern
	 * this pattern is basically just using an Interface!
	 */
	public static void main(String[] args) {
		
		Part part = new Spring();
		part.assemble();
	}

}
