package classes;

import interfaces.Part;

public class Actuator implements Part, Cloneable {

	@Override
	public void assemble() {
		System.out.println("assembling an actuator");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
}
