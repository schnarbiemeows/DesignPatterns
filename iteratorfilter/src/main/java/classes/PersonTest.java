package classes;

import interfaces.IObjectTest;

/**
 * @author dylan
 *
 */
public class PersonTest implements IObjectTest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.IObjectTest#test(java.lang.Object)
	 */
	public boolean test(Object o) {
		
		Person p = (Person) o;
		if (p.getGender().equals("female")) {
			return true;
		}
		return false;
	}

}
