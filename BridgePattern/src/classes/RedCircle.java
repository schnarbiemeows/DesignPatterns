package classes;

import interfaces.DrawAPI;

/**
 * @author dylan
 *
 */
public class RedCircle implements DrawAPI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
