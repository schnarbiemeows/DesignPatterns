package classes;

import java.util.Date;

/**
 * @author dylan
 *
 */
public class StateOriginator {

	private TestObject state;
	private Date dateCreated;

	public TestObject getState() {
		return state;
	}

	public void setState(TestObject state) {
		this.state = state;
	}

	/**
	 * @return
	 */
	public Memento saveStateToMemento() {
		Date today = new Date();
		return new Memento(state, today);
	}

	/**
	 * @param memento
	 */
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
		dateCreated = memento.getDateCreated();
	}

	public Date getDateCreated() {
		return dateCreated;
	}
}
