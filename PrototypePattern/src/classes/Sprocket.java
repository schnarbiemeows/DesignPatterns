package classes;

import interfaces.Part;

public class Sprocket implements Part, Cloneable {

	@Override
	public void assemble() {
		System.out.println("assembling a sprocket");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
}
