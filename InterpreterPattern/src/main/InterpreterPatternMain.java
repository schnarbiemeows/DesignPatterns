package main;

import classes.Interpreter;
import classes.ReverseStringExpression;
import classes.UpperStringExpression;
import interfaces.Expression;

public class InterpreterPatternMain {

	/*
	 * Behavioral Pattern
	 * this pattern is used to define a grammatical representation for a language
	 * and to provide an interpreter to deal with this language
	 */
	public static void main(String[] args) {
		// the interpreter has translation methods
		Interpreter interpreter = new Interpreter();
		// the expressions contain the text to translate and a method for pulling in an interpreter
		// and performing the interpretation(translation)
		Expression stringToReverse = new ReverseStringExpression("the quick brown fox jumped over the lazy dog!");
		Expression toUpperExpression = new UpperStringExpression("the quick brown fox jumped over the lazy dog!");
		// call the interpreter method on the string
		System.out.println(stringToReverse.interpret(interpreter));
		System.out.println(toUpperExpression.interpret(interpreter));
	}

}
