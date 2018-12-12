package classes;

import interfaces.IObjectTest;

public class CarTest implements IObjectTest {

	public boolean test(Object o) {
		// TODO Auto-generated method stub
		Car p = (Car)o;
		if(null!=p.getColor()&&p.getColor().equals("yellow")) {
			return true;
		}
		return false;
	}

}
