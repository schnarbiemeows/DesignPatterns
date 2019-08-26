package classes;

import java.util.HashMap;
import java.util.Map;

import interfaces.Part;

/**
 * @author dylan
 *
 */
public class PartFactory {

	private Map<String, Part> factory = new HashMap<String, Part>();

	/**
	 * @param type
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Part getPart(String type) throws CloneNotSupportedException {
		if (type.equalsIgnoreCase("spring")) {
			Spring spring = (Spring) factory.get(type);
			if (spring == null) {
				factory.put(type, new Spring());
				System.out.println("adding the spring part type to inventory");
				spring = (Spring) factory.get(type);
			}
			return (Part) spring.clone();
		} else if (type.equalsIgnoreCase("sprocket")) {
			Sprocket sprocket = (Sprocket) factory.get(type);
			if (sprocket == null) {
				System.out.println("adding the sprocket part type to inventory");
				factory.put(type, new Sprocket());
				sprocket = (Sprocket) factory.get(type);
			}
			return (Part) sprocket.clone();
		} else if (type.equalsIgnoreCase("actuator")) {
			Actuator actuator = (Actuator) factory.get(type);
			if (actuator == null) {
				System.out.println("adding the actuator part type to inventory");
				factory.put(type, new Actuator());
				actuator = (Actuator) factory.get(type);
			}
			return (Part) actuator.clone();
		} else {
			System.out.println("we don't make the " + type + " part type!");
		}
		return null;
	}
}
