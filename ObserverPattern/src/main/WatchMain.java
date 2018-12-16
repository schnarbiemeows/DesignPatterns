package main;

import classes.Gear;
import classes.TimexWatch;
import interfaces.Watch;

public class WatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch myWatch = new TimexWatch();
		myWatch.setPart(new Gear(1));
		myWatch.setPart(new Gear(2));
		myWatch.setPart(new Gear(3));
		myWatch.setPart(new Gear(4));
		myWatch.setPart(new Gear(5));
		myWatch.oilWatch();
	}

}
