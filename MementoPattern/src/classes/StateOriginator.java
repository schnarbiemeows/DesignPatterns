package classes;

import java.util.Date;

public class StateOriginator {

	private TestObject state;
	private Date dateCreated;
	
	public TestObject getState() {
		return state;
	}

	public void setState(TestObject state) {
		this.state = state;
	}

	public Memento saveStateToMemento() {
		Date today = new Date();
		return new Memento(state,today);
	}

	public void getStateFromMemento(Memento memento){
		state = memento.getState();
		dateCreated = memento.getDateCreated();
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
}
