package main;

import classes.StateHistory;
import classes.StateOriginator;
import classes.TestObject;

public class MementoPatternMain {

	/*
	 * Behavioral Pattern The Memento pattern is used to restore state of an object
	 * to a previous state
	 */
	public static void main(String[] args) {

		StateOriginator originator = new StateOriginator();
		StateHistory careTaker = new StateHistory();

		TestObject current = new TestObject("abcd",1,100,true);
		originator.setState(current);
		current = new TestObject("abcd",2,100,true);
		originator.setState(current);
		careTaker.add(originator.saveStateToMemento());
		System.out.println("history size = " + careTaker.getSize());
		current = new TestObject("abcd",3,100,true);
		originator.setState(current);
		careTaker.add(originator.saveStateToMemento());
		System.out.println("history size = " + careTaker.getSize());
		current = new TestObject("abcd",4,100,true);
		originator.setState(current);
		System.out.println("Current State: " + originator.getState().getId());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState().getId() + " , created on " + originator.getDateCreated());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState().getId() + " , created on " + originator.getDateCreated());

	}

}
