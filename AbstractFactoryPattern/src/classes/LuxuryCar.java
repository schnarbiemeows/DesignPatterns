package classes;

/**
 * @author dylan
 *
 */
public class LuxuryCar implements Car {

	private String type = "Luxury Car";
	/**
	 * 
	 */
	public LuxuryCar() {
		
	}

	/* (non-Javadoc)
	 * @see classes.Car#getCarType()
	 */
	@Override
	public String getCarType() {
		
		return type;
	}

}
