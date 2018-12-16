package classes;

public class WoodHouse extends House {

	@Override
	public void buildWalls() {
		System.out.println("building wood walls!");
	}

	@Override
	public void buildfloor() {
		System.out.println("building wood floor!");
	}

	@Override
	public void buildroof() {
		System.out.println("building wood roof!");
	}

}
