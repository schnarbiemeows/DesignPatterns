package classes;

/**
 * @author dylan
 *
 */
public class Jallopy implements Car {

	private String type = "Jallopy";
	/**
	 * 
	 */
	public Jallopy() {
		
	}

	/* (non-Javadoc)
	 * @see classes.Car#getCarType()
	 */
	@Override
	public String getCarType() {
		
		return type;
	}

}
