package classes;

import interfaces.State;

/**
 * @author dylan
 *
 */
public class StereoContext {
	private State state;

	/**
	 * 
	 */
	public StereoContext() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
