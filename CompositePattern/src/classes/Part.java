package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dylan
 *
 */
public class Part {

	private int partId;
	private String partName;
	private String manufaturer;
	private List<Part> partComponents;

	/**
	 * @param partId
	 * @param partName
	 * @param manufaturer
	 */
	public Part(int partId, String partName, String manufaturer) {
		super();
		this.partId = partId;
		this.partName = partName;
		this.manufaturer = manufaturer;
		this.partComponents = new ArrayList<Part>();
	}

	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getManufaturer() {
		return manufaturer;
	}

	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}

	public List<Part> getPartComponents() {
		return partComponents;
	}

	public void setPartComponents(List<Part> partComponents) {
		this.partComponents = partComponents;
	}

	/**
	 * 
	 */
	public void assemblePart() {
		if (!this.partComponents.isEmpty()) {
			System.out.println("assembling part : " + this.partName + " from the following parts : ");
			for (Part p : this.partComponents) {
				displayPart(p);
			}
		} else {
			System.out.println("part : " + this.partName + " has no constituent parts");
		}
	}

	/**
	 * @param part
	 */
	public void displayPart(Part part) {
		System.out.println(
				"part # : " + part.partId + " , name : " + part.partName + " , manufacturer : " + part.manufaturer);
	}

}
