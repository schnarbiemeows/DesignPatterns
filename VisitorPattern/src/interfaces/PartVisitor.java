package interfaces;

import classes.Actuator;
import classes.Spring;
import classes.Sprocket;
import classes.Watch;

/**
 * @author dylan
 *
 */
public interface PartVisitor {

	/**
	 * @param watch
	 */
	public void visit(Watch watch);

	/**
	 * @param spring
	 */
	public void visit(Spring spring);

	/**
	 * @param sprocket
	 */
	public void visit(Sprocket sprocket);

	/**
	 * @param actuator
	 */
	public void visit(Actuator actuator);
}
