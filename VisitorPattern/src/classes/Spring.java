package classes;

import interfaces.Part;
import interfaces.PartVisitor;

public class Spring implements Part {

	@Override
	public void assemble() {
		System.out.println("assembling a spring");
	}

	@Override
	public void acceptVisitor(PartVisitor visitor) {
		visitor.visit(this);
	}
}
