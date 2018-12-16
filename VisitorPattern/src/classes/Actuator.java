package classes;

import interfaces.Part;
import interfaces.PartVisitor;

public class Actuator implements Part {

	@Override
	public void assemble() {
		System.out.println("assembling an actuator");
	}

	@Override
	public void acceptVisitor(PartVisitor visitor) {
		visitor.visit(this);
	}
}
