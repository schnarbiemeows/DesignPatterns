package classes;

import interfaces.Part;
import interfaces.PartVisitor;

public class Watch implements Part {

	Part[] watchparts;

	public Watch() {
		super();
		watchparts = new Part[] { new Spring(), new Sprocket(), new Actuator() };
	}

	@Override
	public void assemble() {
		System.out.println("assembling a watch");
	}

	@Override
	public void acceptVisitor(PartVisitor visitor) {
		for (int i = 0; i < watchparts.length; i++) {
			watchparts[i].acceptVisitor(visitor);
		}
		visitor.visit(this);
	}

}
