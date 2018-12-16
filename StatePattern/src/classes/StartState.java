package classes;

import interfaces.State;

public class StartState implements State {

	@Override
	public void doAction(StereoContext context) {
		System.out.println("Starting the Stereo");
		context.setState(this);
	}

	public String toString() {
		return "Stereo is ON";
	}
}
