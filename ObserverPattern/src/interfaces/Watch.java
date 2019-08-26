package interfaces;

/**
 * @author dylan
 *
 */
public interface Watch {

	// Subject
	/**
	 * @param p
	 */
	public void setPart(Part p);

	/**
	 * 
	 */
	public void oilWatch();

	/**
	 * 
	 */
	public void notifyObservers();
}
