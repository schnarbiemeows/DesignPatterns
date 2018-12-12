package classes;

import interfaces.Iterator;

public class PartIterator implements Iterator {

	String[] items;
	int index = 0;
	
	public PartIterator(String[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(index<items.length) return true;
		return false;
	}

	@Override
	public Object next() {
		Object item = items[index];
		index++;
		return item;
	}

}
