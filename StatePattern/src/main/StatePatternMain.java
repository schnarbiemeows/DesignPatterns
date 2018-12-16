package main;

import classes.StereoContext;
import classes.StartState;
import classes.StopState;

public class StatePatternMain {

	/*
	 * Behavioral pattern
	 * this pattern uses a Context object which holds a State interface.
	 * The Context object actually represents a real object(like a stereo)
	 * StereoRemote is an example of using state without using this pattern.
	 * 
	 * The benefits of using State pattern to implement polymorphic behavior 
	 * is clearly visible. The chances of error are less and it’s very easy to 
	 * add more states for additional behavior. Thus making our code more robust, 
	 * easily maintainable and flexible. Also State pattern helped in avoiding if-else 
	 * or switch-case conditional logic in this scenario.
	 */
	public static void main(String[] args) {

		StereoContext context = new StereoContext();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}

}
