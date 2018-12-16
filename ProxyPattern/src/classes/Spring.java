package classes;

import interfaces.Part;

public class Spring implements Part, Cloneable  {

	@Override
	public void assemble() {
		System.out.println("assembling a spring");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
}
