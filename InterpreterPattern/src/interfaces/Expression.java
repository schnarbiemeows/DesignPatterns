package interfaces;

import classes.Interpreter;

/**
 * @author dylan
 *
 */
public interface Expression {

	/**
	 * @param interpreter
	 * @return
	 */
	public String interpret(Interpreter interpreter);
}
