package classes;

public class GermanFactory {

	public GermanFactory() {
		// TODO Auto-generated constructor stub
	}

	public Car getCar(String type) {
		if(type==null) {
			System.out.println("no type specified!");
			return null;
		}
		if(type.equalsIgnoreCase("mini")) {
			System.out.println("making a Mini!");
			return new MiniCar();
		}
		if(type.equalsIgnoreCase("luxury")) {
			System.out.println("making a luxury!");
			return new LuxuryCar();
		}
		if(type.equalsIgnoreCase("jallopy")) {
			System.out.println("making a jallopy!");
			return new Jallopy();
		}
		System.out.println("wrong type specified!");
		return null;
	}
}
