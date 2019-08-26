package classes;

import interfaces.Part;
import interfaces.PartVisitor;

/**
 * @author dylan
 *
 */
public class Watch implements Part {

	Part[] watchparts;

	/**
	 * 
	 */
	public Watch() {
		super();
		watchparts = new Part[] { new Spring(), new Sprocket(), new Actuator() };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#assemble()
	 */
	@Override
	public void assemble() {
		System.out.println("assembling a watch");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#acceptVisitor(interfaces.PartVisitor)
	 */
	@Override
	public void acceptVisitor(PartVisitor visitor) {
		for (int i = 0; i < watchparts.length; i++) {
			watchparts[i].acceptVisitor(visitor);
		}
		visitor.visit(this);
	}

}
