package classes;

import interfaces.Part;

/**
 * @author dylan
 *
 */
public class TimexDigitalWatch extends DigitalWatch {

	/**
	 * @param part
	 */
	public TimexDigitalWatch(Part part) {
		super(part);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.DigitalWatch#slogan()
	 */
	@Override
	public void slogan() {
		System.out.println("It takes a lickin and keeps on tickin!");
		;
	}
}
