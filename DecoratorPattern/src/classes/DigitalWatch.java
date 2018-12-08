package classes;

import interfaces.Part;

public abstract class DigitalWatch implements Part {

	Part part;
	
	
	public DigitalWatch(Part part) {
		super();
		this.part = part;
	}


	@Override
	public void assemble() {
		part.assemble();
	}
	
	public abstract void slogan();

}
