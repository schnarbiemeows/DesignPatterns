package classes;

public class SingletonClass {

	// the class has itself as a static parameter
	private static SingletonClass singletonClass = new SingletonClass();
	private int value = 1;
	
	private SingletonClass() {
		// the constructor HAS to be private
	}

	public static SingletonClass getInstance() {
		return singletonClass;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
