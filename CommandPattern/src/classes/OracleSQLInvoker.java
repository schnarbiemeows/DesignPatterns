package classes;

import interfaces.Invoker;

/**
 * @author dylan
 *
 */
public class OracleSQLInvoker implements Invoker {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Invoker#createTable()
	 */
	@Override
	public void createTable() {
		System.out.println("creating Oracle table");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Invoker#deleteTable()
	 */
	@Override
	public void deleteTable() {
		System.out.println("deleting Oracle table");
	}
}
