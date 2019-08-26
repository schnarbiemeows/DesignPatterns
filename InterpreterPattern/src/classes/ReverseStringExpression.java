package classes;

import interfaces.Expression;

/**
 * @author dylan
 *
 */
public class ReverseStringExpression implements Expression {

	private String data;

	/**
	 * @param data
	 */
	public ReverseStringExpression(String data) {
		super();
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Expression#interpret(classes.Interpreter)
	 */
	@Override
	public String interpret(Interpreter interpreter) {
		
		return interpreter.reverse(data);
	}

}
