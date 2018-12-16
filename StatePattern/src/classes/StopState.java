package classes;

import interfaces.State;

public class StopState implements State {

	@Override
	public void doAction(StereoContext context) {
		System.out.println("Stopping the Stereo");
		context.setState(this);
	}

	public String toString() {
		return "Stereo is OFF";
	}
}
