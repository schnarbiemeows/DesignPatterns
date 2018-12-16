package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Command;

public class CommandQueue {

	private List<Command> commands = new ArrayList<Command>(); 
	
	public void addInstruction(Command c) {
		commands.add(c);
	}
	public void runCommands() {
		for(Command c : commands) {
			c.invokeCommand();
		}
	}
}
