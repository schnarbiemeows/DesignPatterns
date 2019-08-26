package classes;

/**
 * @author dylan
 *
 */
public class Pitcher implements BaseBallPlayer {

	private int heightInInches;
	private float weight;

	/**
	 * @param heightInInches
	 * @param weight
	 */
	public Pitcher(int heightInInches, float weight) {
		super();
		this.heightInInches = heightInInches;
		this.weight = weight;
	}

	public Pitcher() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.BaseBallPlayer#getHeightInInches()
	 */
	@Override
	public int getHeightInInches() {
		System.out.println("getting Pitcher's height");
		return this.heightInInches;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.BaseBallPlayer#setHeightInInches(int)
	 */
	@Override
	public void setHeightInInches(int height) {
		System.out.println("setting Pitcher's height");
		this.heightInInches = height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.BaseBallPlayer#getWeight()
	 */
	@Override
	public float getWeight() {
		System.out.println("getting Pitcher's weight");
		return this.weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.BaseBallPlayer#setWeight(float)
	 */
	@Override
	public void setWeight(float weight) {
		System.out.println("setting Pitcher's weight");
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.BaseBallPlayer#warmTheBench()
	 */
	@Override
	public void warmTheBench() {

		System.out.println("Pitcher is warming the bench!");
	}

}
