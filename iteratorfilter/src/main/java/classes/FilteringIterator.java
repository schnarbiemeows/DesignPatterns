package classes;

import java.util.Iterator;

import interfaces.IObjectTest;

public class FilteringIterator implements Iterator<Object> {
	
	private Iterator<?> iterator;
	private IObjectTest tester;
	private Object currentItemInTheIterator;
	
	public FilteringIterator(Iterator<?> myIterator, IObjectTest myTest) {
		super();
		this.iterator = myIterator;
		this.tester = myTest;
	}

	public boolean hasNext() {
		while(iterator.hasNext()) {
			currentItemInTheIterator = iterator.next();
			if(this.tester.test(currentItemInTheIterator)) {
					return true;
			}
		}
		return false;
	}

	public Object next() {
		return currentItemInTheIterator;
	}

}
