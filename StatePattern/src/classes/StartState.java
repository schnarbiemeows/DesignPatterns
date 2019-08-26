package classes;

import interfaces.State;

/**
 * @author dylan
 *
 */
public class StartState implements State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.State#doAction(classes.StereoContext)
	 */
	@Override
	public void doAction(StereoContext context) {
		System.out.println("Starting the Stereo");
		context.setState(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stereo is ON";
	}
}
