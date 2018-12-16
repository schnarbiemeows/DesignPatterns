package classes;

import interfaces.Invoker;

public class OracleSQLInvoker implements Invoker {

	@Override
	public void createTable() {
		System.out.println("creating Oracle table");
	}

	@Override
	public void deleteTable() {
		System.out.println("deleting Oracle table");
	}
}
