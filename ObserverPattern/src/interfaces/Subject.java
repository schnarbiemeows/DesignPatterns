package interfaces;

/**
 * @author dylan
 *
 */
public interface Subject {

	/**
	 * @param o
	 */
	public void registerWithTopic(Observer o);

	/**
	 * @param o
	 */
	public void unRegisterWithTopic(Observer o);

	/**
	 * 
	 */
	public void notifyObservers();

	/**
	 * @param o
	 * @return
	 */
	public Object getTopicUpdate(Observer o);
}
