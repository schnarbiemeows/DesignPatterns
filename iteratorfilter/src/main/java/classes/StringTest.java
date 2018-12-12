package classes;

import interfaces.IObjectTest;

public class StringTest implements IObjectTest {

	public boolean test(Object o) {
		if(o==null) {
			return false;
		}
		// return true if the length is = 5
		String s = (String)o;
		return s.length()==5;
	}

}
