package classes;

import interfaces.Invoker;

public class MySQLInvoker implements Invoker {

	@Override
	public void createTable() {
		System.out.println("creating MySQL table");
	}

	@Override
	public void deleteTable() {
		System.out.println("deleting MySQL table");
	}

}
