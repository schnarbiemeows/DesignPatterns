package main;

import classes.GlassHouse;
import classes.House;
import classes.WoodHouse;

/**
 * @author dylan
 *
 */
public class TemplateMethodPatternMain {

	/**
	 * Behavioral pattern : this pattern uses an abstract class to define the
	 * methods, and child classes to perform the actual implementations. This
	 * example uses an abstract House class to define the methods, and WoodHouse and
	 * GlassHouse classes for actually building the house
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		House house1 = new GlassHouse();
		house1.buildHouse();
		House house2 = new WoodHouse();
		house2.buildHouse();
	}

}
