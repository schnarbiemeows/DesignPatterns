package classes;

import interfaces.Part;

public class Actuator implements Part {

	@Override
	public void assemble() {
		System.out.println("assembling an actuator");
	}

}
