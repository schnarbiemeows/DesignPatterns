package classes;

import interfaces.Expression;

public class UpperStringExpression implements Expression {

	private String data;
	
	public UpperStringExpression(String data) {
		super();
		this.data = data;
	}

	@Override
	public String interpret(Interpreter interpreter) {
		// TODO Auto-generated method stub
		return interpreter.toUpper(data);
	}

}
