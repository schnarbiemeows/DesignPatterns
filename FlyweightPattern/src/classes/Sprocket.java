package classes;

import interfaces.Part;

/**
 * @author dylan
 *
 */
public class Sprocket implements Part {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#assemble()
	 */
	@Override
	public void assemble() {
		System.out.println("assembling a sprocket");
	}

}
