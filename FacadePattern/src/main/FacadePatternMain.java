package main;

import classes.PartMaker;

public class FacadePatternMain {

	/*
	 * Structural pattern
	 * The Facade pattern hides the complexities of the system, and provides a client(PartMaker)
	 * to the user by where they can access the system(system of parts). The PartMaker class provides
	 * simple methods for the client to use, and delegates calls to methods of the inner system classes
	 * to implement these methods
	 */
	public static void main(String[] args) {
		PartMaker maker = new PartMaker();
		maker.assembleSpring();
		maker.assembleSprocket();
		maker.assembleActuator();
	}

}
