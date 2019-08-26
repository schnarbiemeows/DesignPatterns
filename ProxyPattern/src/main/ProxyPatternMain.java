package main;

import classes.Spring;
import interfaces.Part;

/**
 * @author dylan
 *
 */
public class ProxyPatternMain {

	/**
	 * * Structural pattern this pattern is basically just using an Interface!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Part part = new Spring();
		part.assemble();
	}

}
