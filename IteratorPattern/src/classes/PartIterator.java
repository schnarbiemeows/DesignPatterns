package classes;

import interfaces.Iterator;

/**
 * @author dylan
 *
 */
public class PartIterator implements Iterator {

	String[] items;
	int index = 0;

	/**
	 * @param items
	 */
	public PartIterator(String[] items) {
		super();
		this.items = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (index < items.length)
			return true;
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Iterator#next()
	 */
	@Override
	public Object next() {
		Object item = items[index];
		index++;
		return item;
	}

}
