package classes;

import interfaces.Part;

/**
 * @author dylan
 *
 */
public abstract class DigitalWatch implements Part {

	Part part;

	/**
	 * @param part
	 */
	public DigitalWatch(Part part) {
		super();
		this.part = part;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#assemble()
	 */
	@Override
	public void assemble() {
		part.assemble();
	}

	/**
	 * 
	 */
	public abstract void slogan();

}
