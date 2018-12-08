package classes;

import interfaces.Expression;

public class ReverseStringExpression implements Expression {

	private String data;
	
	public ReverseStringExpression(String data) {
		super();
		this.data = data;
	}

	@Override
	public String interpret(Interpreter interpreter) {
		// TODO Auto-generated method stub
		return interpreter.reverse(data);
	}

}
