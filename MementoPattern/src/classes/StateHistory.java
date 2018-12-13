package classes;

import java.util.ArrayList;
import java.util.List;

public class StateHistory {

	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
	
	public int getSize() {
		return mementoList.size();
	}
}
