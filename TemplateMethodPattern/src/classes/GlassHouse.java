package classes;

/**
 * @author dylan
 *
 */
public class GlassHouse extends House {

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.House#buildWalls()
	 */
	@Override
	public void buildWalls() {
		System.out.println("building glass walls!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.House#buildfloor()
	 */
	@Override
	public void buildfloor() {
		System.out.println("building glass floor!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.House#buildroof()
	 */
	@Override
	public void buildroof() {
		System.out.println("building glass roof!");
	}

}
