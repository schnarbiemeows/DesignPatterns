package classes;

import interfaces.Part;

public class Sprocket implements Part {

	@Override
	public void assemble() {
		System.out.println("assembling a sprocket");
	}

}
