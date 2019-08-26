package classes;

/**
 * @author dylan
 *
 */
public class SingletonClass {

	/**
	 * the class has itself as a static parameter
	 */
	private static SingletonClass singletonClass = new SingletonClass();
	private int value = 1;

	/**
	 * constructor : HAS to be private
	 */
	private SingletonClass() {
		// the constructor HAS to be private
	}

	/**
	 * @return
	 */
	public static SingletonClass getInstance() {
		return singletonClass;
	}

	/**
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
