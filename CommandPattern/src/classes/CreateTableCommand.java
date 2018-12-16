package classes;

import interfaces.Command;
import interfaces.Invoker;

public class CreateTableCommand implements Command {

	private Invoker invoker;

	
	public CreateTableCommand(Invoker invoker) {
		super();
		this.invoker = invoker;
	}


	@Override
	public void invokeCommand() {
		invoker.createTable();
	}
}
