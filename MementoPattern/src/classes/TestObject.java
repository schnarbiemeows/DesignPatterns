package classes;

public class TestObject {

	private String name;
	private int id;
	private long number;
	private boolean active;
	public TestObject(String name, int id, long number, boolean active) {
		super();
		this.name = name;
		this.id = id;
		this.number = number;
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
