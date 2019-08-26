package classes;

import interfaces.Part;

/**
 * @author dylan
 *
 */
public class Watch implements Part {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#assemble()
	 */
	@Override
	public void assemble() {

		System.out.println("assembling a watch");
	}

}
