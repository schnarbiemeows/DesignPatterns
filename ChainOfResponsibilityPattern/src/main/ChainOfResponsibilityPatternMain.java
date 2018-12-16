package main;

import classes.AbstractLogger;
import classes.ChainPatternDemo;

public class ChainOfResponsibilityPatternMain {

	/*
	 * Behavioral Pattern Loggers are a typical example each class has a link to the
	 * next class in the chain, and requests are sent down this chain according to
	 * who can handle the request
	 * INFO<DEBUG<ERROR, and all levels can display items their level and higher
	 * so INFO can also do DEBUG and ERROR
	 */
	public static void main(String[] args) {

		AbstractLogger loggerChain = ChainPatternDemo.getChainOfLoggers();

		// only the consoleLogger will log this, cause its level 1
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		// consoleLogger and fileLogger will display this, because they are level 1 nd 2
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		// all 3 will display this
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

}
