package classes;

import interfaces.IObjectTest;

/**
 * @author dylan
 *
 */
public class StringTest implements IObjectTest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.IObjectTest#test(java.lang.Object)
	 */
	public boolean test(Object o) {
		if (o == null) {
			return false;
		}
		// return true if the length is = 5
		String s = (String) o;
		return s.length() == 5;
	}

}
