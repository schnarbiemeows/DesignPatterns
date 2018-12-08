package main;

import classes.BaseBallPlayer;
import classes.BaseballPlayerFactory;

public class FactoryPatternMain {

	public static void main(String[] args) {
		
		BaseballPlayerFactory agent = new BaseballPlayerFactory();
		BaseBallPlayer pitcher = agent.getPlayer("pitcher");
		pitcher.setHeightInInches(70);
		BaseBallPlayer catcher = agent.getPlayer("catcher");
		catcher.setHeightInInches(68);
		BaseBallPlayer outfielder = agent.getPlayer("outfielder");
		outfielder.setHeightInInches(49);
	}

}
