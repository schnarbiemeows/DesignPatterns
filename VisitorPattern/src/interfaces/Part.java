package interfaces;

public interface Part {

	public void assemble();
	public void acceptVisitor(PartVisitor visitor);
}
