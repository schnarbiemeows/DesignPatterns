package classes;

import interfaces.Command;
import interfaces.Invoker;

/**
 * @author dylan
 *
 */
public class CreateTableCommand implements Command {

	private Invoker invoker;

	/**
	 * @param invoker
	 */
	public CreateTableCommand(Invoker invoker) {
		super();
		this.invoker = invoker;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Command#invokeCommand()
	 */
	@Override
	public void invokeCommand() {
		invoker.createTable();
	}
}
