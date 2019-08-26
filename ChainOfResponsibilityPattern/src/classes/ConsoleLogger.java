package classes;

/**
 * @author dylan
 *
 */
public class ConsoleLogger extends AbstractLogger {

	/**
	 * @param level
	 */
	public ConsoleLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
