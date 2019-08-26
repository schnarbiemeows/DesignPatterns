package classes;

import java.util.Iterator;

import interfaces.IObjectTest;

/**
 * @author dylan
 *
 */
public class FilteringIterator implements Iterator<Object> {

	private Iterator<?> iterator;
	private IObjectTest tester;
	private Object currentItemInTheIterator;

	/**
	 * @param myIterator
	 * @param myTest
	 */
	public FilteringIterator(Iterator<?> myIterator, IObjectTest myTest) {
		super();
		this.iterator = myIterator;
		this.tester = myTest;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext() {
		while (iterator.hasNext()) {
			currentItemInTheIterator = iterator.next();
			if (this.tester.test(currentItemInTheIterator)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	public Object next() {
		return currentItemInTheIterator;
	}

}
