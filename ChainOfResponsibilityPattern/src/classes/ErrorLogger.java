package classes;

/**
 * @author dylan
 *
 */
public class ErrorLogger extends AbstractLogger {

	/**
	 * @param level
	 */
	public ErrorLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
