package classes;

import interfaces.Part;

/**
 * @author dylan
 *
 */
public class Sprocket implements Part, Cloneable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#assemble()
	 */
	@Override
	public void assemble() {
		System.out.println("assembling a sprocket");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
