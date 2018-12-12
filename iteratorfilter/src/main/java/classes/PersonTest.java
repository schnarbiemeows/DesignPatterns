package classes;

import java.util.Iterator;

import interfaces.IObjectTest;

public class PersonTest implements IObjectTest {

	public boolean test(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person)o;
		if(p.getGender().equals("female")) {
			return true;
		}
		return false;
	}

}
