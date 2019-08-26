package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dylan
 *
 */
public class StateHistory {

	private List<Memento> mementoList = new ArrayList<Memento>();

	/**
	 * @param state
	 */
	public void add(Memento state) {
		mementoList.add(state);
	}

	/**
	 * @param index
	 * @return
	 */
	public Memento get(int index) {
		return mementoList.get(index);
	}

	/**
	 * @return
	 */
	public int getSize() {
		return mementoList.size();
	}
}
