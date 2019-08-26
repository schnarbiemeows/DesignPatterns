package classes;

import interfaces.Part;
import interfaces.PartVisitor;

/**
 * @author dylan
 *
 */
public class Actuator implements Part {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#assemble()
	 */
	@Override
	public void assemble() {
		System.out.println("assembling an actuator");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#acceptVisitor(interfaces.PartVisitor)
	 */
	@Override
	public void acceptVisitor(PartVisitor visitor) {
		visitor.visit(this);
	}
}
