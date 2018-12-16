package classes;

public class GlassHouse extends House {

	@Override
	public void buildWalls() {
		System.out.println("building glass walls!");
	}

	@Override
	public void buildfloor() {
		System.out.println("building glass floor!");
	}

	@Override
	public void buildroof() {
		System.out.println("building glass roof!");
	}

}
