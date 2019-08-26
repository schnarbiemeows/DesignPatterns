package classes;

import interfaces.DrawAPI;

/**
 * @author dylan
 *
 */
public abstract class Shape {

	protected DrawAPI drawAPI;

	/**
	 * @param drawAPI
	 */
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	/**
	 * 
	 */
	public abstract void draw();
}
