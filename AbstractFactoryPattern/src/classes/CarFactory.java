package classes;

public class CarFactory {

	public CarFactory() {
		// TODO Auto-generated constructor stub
	}

	public Car orderCar(String location, String type) {
		if(location==null) {
			System.out.println("no factory specified!");
			return null;
		}
		if(location.equalsIgnoreCase("US")) {
			return new USfactory().getCar(type);
		}
		if(location.equalsIgnoreCase("Germany")) {
			return new GermanFactory().getCar(type);
		}
		if(location.equalsIgnoreCase("Japan")) {
			return new JapanFactory().getCar(type);
		}
		System.out.println("wrong factory location specified!");
		return null;
	}
}
