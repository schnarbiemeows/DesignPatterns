package interfaces;

/**
 * @author dylan
 *
 */
public interface Part {

	/**
	 * 
	 */
	public void assemble();

	/**
	 * @param visitor
	 */
	public void acceptVisitor(PartVisitor visitor);
}
