package main;

import classes.SingletonClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass thisClass = SingletonClass.getInstance();
		System.out.println(thisClass.getValue());
		thisClass.setValue(2);
		System.out.println(thisClass.getValue());
	}

}
