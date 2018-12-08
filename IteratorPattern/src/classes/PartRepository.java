package classes;

import interfaces.Container;
import interfaces.Iterator;

public class PartRepository implements Container {

	public String[] parts = {"watch","spring","sprocket","actuator","nut","bolt"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
