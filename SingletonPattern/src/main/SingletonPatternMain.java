package main;

import classes.SingletonClass;

public class SingletonPatternMain {

	public static void main(String[] args) {
		
		SingletonClass thisClass = SingletonClass.getInstance();
		System.out.println(thisClass.getValue());
		thisClass.setValue(2);
		System.out.println(thisClass.getValue());
	}

}
