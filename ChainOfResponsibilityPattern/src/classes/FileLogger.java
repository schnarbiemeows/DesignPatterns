package classes;

/**
 * @author dylan
 *
 */
public class FileLogger extends AbstractLogger {

	/**
	 * @param level
	 */
	public FileLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
