package classes;

import interfaces.Container;
import interfaces.Iterator;

/**
 * @author dylan
 *
 */
public class PartRepository implements Container {

	String[] parts;

	/**
	 * @param parts
	 */
	public PartRepository(String[] parts) {
		super();
		this.parts = parts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Container#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		
		return new PartIterator(parts);
	}

}
