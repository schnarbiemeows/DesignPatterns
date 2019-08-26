package classes;

import java.util.Date;

/**
 * @author dylan
 *
 */
public class Memento {
	private TestObject state;
	private Date dateCreated;

	/**
	 * @param state
	 * @param dateCreated
	 */
	public Memento(TestObject state, Date dateCreated) {
		this.state = state;
		this.dateCreated = dateCreated;
	}

	/**
	 * @return
	 */
	public TestObject getState() {
		return state;
	}

	/**
	 * @return
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
}
