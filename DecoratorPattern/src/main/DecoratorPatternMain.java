package main;

import classes.DigitalWatch;
import classes.TimexDigitalWatch;
import classes.Watch;

public class DecoratorPatternMain {
	/*
	 * structural pattern
	 * this pattern adds functionality to a simple implementer(Watch) by using an abstract class(DigitalWatch)
	 * which contains a copy of the Part interface. Then the TimexDigitalWatch class can use this abstract class
	 * to create an inner instance of Watch(thus inheriting its functionality whilst keeping the original
	 * Watch class unchanged) and, in addition, new functionality can be added in the TimexDigitalWatch class
	 */
	public static void main(String[] args) {
		
		DigitalWatch myWatch = new TimexDigitalWatch(new Watch());
		// can use the method from the old class
		myWatch.assemble();
		// can use a method from the decorator class
		myWatch.slogan();
	}

}
