package classes;

/**
 * @author dylan
 *
 */
public abstract class House {

	/**
	 * this is the method for building the walls
	 */
	public abstract void buildWalls();

	/**
	 * this is the method for building the floor
	 */
	public abstract void buildfloor();

	/**
	 * this is the method for building the roof
	 */
	public abstract void buildroof();

	/**
	 * this is the blueprint for building a house
	 */
	public void buildHouse() {
		buildWalls();
		buildfloor();
		buildroof();
	}
}
