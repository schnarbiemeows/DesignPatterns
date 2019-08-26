package classes;

import interfaces.Color;

/**
 * @author dylan
 *
 */
public abstract class Shape2 {

	protected Color color;

	/**
	 * @param colortype
	 */
	public Shape2(String colortype) {
		if (colortype.equalsIgnoreCase("GREEN")) {
			this.color = new Green();
		}
		if (colortype.equalsIgnoreCase("RED")) {
			this.color = new Red();
		}
	}

	/**
	 * 
	 */
	public void color() {
		color.color();
	}
}
