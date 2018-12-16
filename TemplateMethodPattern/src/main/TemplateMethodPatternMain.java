package main;

import classes.GlassHouse;
import classes.House;
import classes.WoodHouse;

public class TemplateMethodPatternMain {

	/*
	 * Behvioral pattern
	 * this pattern uses an abstract class 
	 * 
	 */
	public static void main(String[] args) {
		
		House house1 = new GlassHouse();
		house1.buildHouse();
		House house2 = new WoodHouse();
		house2.buildHouse();
	}

}
