package classes;

public abstract class House {

	public abstract void buildWalls();
	public abstract void buildfloor();
	public abstract void buildroof();
	
	// this is the template
	public void buildHouse() {
		buildWalls();
		buildfloor();
		buildroof();
	}
}
