package classes;

/**
 * @author dylan
 *
 */
public class MiniCar implements Car {

	private String type = "Mini Car";
	/**
	 * 
	 */
	public MiniCar() {
		
	}

	/* (non-Javadoc)
	 * @see classes.Car#getCarType()
	 */
	@Override
	public String getCarType() {
		
		return type;
	}

}
