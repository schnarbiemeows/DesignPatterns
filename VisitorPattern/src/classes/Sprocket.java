package classes;

import interfaces.Part;
import interfaces.PartVisitor;

public class Sprocket implements Part {

	@Override
	public void assemble() {
		System.out.println("assembling a sprocket");
	}

	@Override
	public void acceptVisitor(PartVisitor visitor) {
		visitor.visit(this);
	}
}
