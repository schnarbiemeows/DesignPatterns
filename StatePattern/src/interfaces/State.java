package interfaces;

import classes.StereoContext;

/**
 * @author dylan
 *
 */
public interface State {
	/**
	 * @param context
	 */
	public void doAction(StereoContext context);
}
