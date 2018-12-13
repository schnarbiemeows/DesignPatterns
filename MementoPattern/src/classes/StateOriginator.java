package classes;

public class StateOriginator {

	private TestObject state;

	public TestObject getState() {
		return state;
	}

	public void setState(TestObject state) {
		this.state = state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento){
		state = memento.getState();
	}
}
