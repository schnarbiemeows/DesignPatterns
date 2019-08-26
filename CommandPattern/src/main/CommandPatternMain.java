package main;

import classes.CommandQueue;
import classes.CreateTableCommand;
import classes.DeleteTableCommand;
import classes.MySQLInvoker;
import classes.OracleSQLInvoker;
import interfaces.Command;
import interfaces.Invoker;

/**
 * @author dylan
 *
 */
public class CommandPatternMain {

	/**
	 * * Behavioral Pattern Command pattern is a data driven design pattern and
	 * falls under behavioral pattern category. A request is wrapped under an object
	 * as command and passed to invoker object. The Invoker object looks for the
	 * appropriate object which can handle this command and passes the command to
	 * the corresponding object which executes the command.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CommandQueue databaseOperations = new CommandQueue();
		Invoker mySQLinvoker = new MySQLInvoker();
		Invoker oracleInvoker = new OracleSQLInvoker();
		Command c1 = new CreateTableCommand(mySQLinvoker);
		Command c2 = new DeleteTableCommand(mySQLinvoker);
		Command c3 = new CreateTableCommand(oracleInvoker);
		Command c4 = new DeleteTableCommand(oracleInvoker);
		databaseOperations.addInstruction(c1);
		databaseOperations.addInstruction(c2);
		databaseOperations.addInstruction(c3);
		databaseOperations.addInstruction(c4);
		databaseOperations.runCommands();
	}
}