package classes;

import interfaces.Command;
import interfaces.Invoker;

public class DeleteTableCommand implements Command {

	private Invoker invoker;

	
	public DeleteTableCommand(Invoker invoker) {
		super();
		this.invoker = invoker;
	}


	@Override
	public void invokeCommand() {
		invoker.deleteTable();
	}
}
