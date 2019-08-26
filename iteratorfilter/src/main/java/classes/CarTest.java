package classes;

import interfaces.IObjectTest;

/**
 * @author dylan
 *
 */
public class CarTest implements IObjectTest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.IObjectTest#test(java.lang.Object)
	 */
	public boolean test(Object o) {
		
		Car p = (Car) o;
		if (null != p.getColor() && p.getColor().equals("yellow")) {
			return true;
		}
		return false;
	}

}
