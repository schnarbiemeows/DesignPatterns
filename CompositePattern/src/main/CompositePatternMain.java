package main;

import java.util.ArrayList;
import java.util.List;

import classes.Part;

/**
 * @author dylan
 *
 */
public class CompositePatternMain {

	/**
	 * Structural Pattern is used when we have to create a part-whole hierarchy and
	 * where we have to treat all objects in the hierarchy in the same way
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Part> parts = new ArrayList<Part>();
		Part watch = new Part(1, "watch", "timex");
		Part spring = new Part(2, "spring", "spring co.");
		Part sprocket = new Part(3, "sprocket", "sprocket co., Inc.");
		Part nut = new Part(4, "nut", "nut makers, inc.");
		Part bolt = new Part(5, "bolt", "bolt makers r us");
		watch.getPartComponents().add(spring);
		watch.getPartComponents().add(sprocket);
		watch.getPartComponents().add(nut);
		watch.getPartComponents().add(bolt);
		parts.add(watch);
		for (Part part : parts) {
			part.assemblePart();
			for (Part subPart : part.getPartComponents()) {
				subPart.assemblePart();
			}
		}
	}

}
