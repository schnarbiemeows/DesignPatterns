package classes;

/**
 * @author dylan
 *
 */
public class WoodHouse extends House {

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.House#buildWalls()
	 */
	@Override
	public void buildWalls() {
		System.out.println("building wood walls!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.House#buildfloor()
	 */
	@Override
	public void buildfloor() {
		System.out.println("building wood floor!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.House#buildroof()
	 */
	@Override
	public void buildroof() {
		System.out.println("building wood roof!");
	}

}
