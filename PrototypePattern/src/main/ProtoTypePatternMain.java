package main;

import classes.PartFactory;
import interfaces.Part;

/**
 * @author dylan
 *
 */
public class ProtoTypePatternMain {

	/**
	 * * Creational Pattern this pattern takes advantage of the fact that cloning an
	 * existing object gives faster performance than creating anther instance of
	 * that object. This is basically the same code as the Flyweight pattern, except
	 * for returning cloned objects
	 * 
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

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
