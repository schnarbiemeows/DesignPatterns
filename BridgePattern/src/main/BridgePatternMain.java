package main;

import classes.Circle;
import classes.GreenCircle;
import classes.RedCircle;
import classes.Shape;
import classes.Shape2;
import classes.Triangle;

public class BridgePatternMain {

	/* the bridge pattern is used when we need to decouple an abstraction from
	* its implementation.
	* Structural pattern
	*/
	public static void main(String[] args) {

		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
		
		Shape2 triangle = new Triangle("RED");
		triangle.color();
	}

}
