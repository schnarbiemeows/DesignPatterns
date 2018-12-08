package main;

import classes.PartFactory;
import interfaces.Part;

public class FlyweightPatternMain {

	/*
	 * Structural Pattern
	 * primarily used to reduce the number of objects created and to decrease the 
	 * memory footprint and increase performance.
	 */
	public static void main(String[] args) {
		
		PartFactory factory = new PartFactory();
		Part part1 = factory.getPart("spring");
		part1.assemble();
		Part part2 = factory.getPart("spring");
		part2.assemble();
		Part part3 = factory.getPart("sprocket");
		part3.assemble();
		Part part4 = factory.getPart("sprocket");
		part4.assemble();
		Part part5 = factory.getPart("actuator");
		part5.assemble();
		Part part6 = factory.getPart("actuator");
		part6.assemble();
		Part part7 = factory.getPart("watch");
	}

}
