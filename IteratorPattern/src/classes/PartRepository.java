package classes;

import interfaces.Container;
import interfaces.Iterator;

public class PartRepository implements Container {

	String[] parts;
	
	public PartRepository(String[] parts) {
		super();
		this.parts = parts;
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new PartIterator(parts);
	}

}
