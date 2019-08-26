package classes;

/**
 * @author dylan
 *
 */
public class Catcher implements BaseBallPlayer {

	private int heightInInches;
	private float weight;
	private float battingAverage;

	/**
	 * @param heightInInches
	 * @param weight
	 * @param battingAverage
	 */
	public Catcher(int heightInInches, float weight, float battingAverage) {
		super();
		this.heightInInches = heightInInches;
		this.weight = weight;
		this.battingAverage = battingAverage;
	}

	public Catcher() {

	}

	@Override
	public int getHeightInInches() {
		System.out.println("setting Catcher's height");
		return this.heightInInches;
	}

	@Override
	public void setHeightInInches(int height) {
		System.out.println("setting Catcher's height");
		this.heightInInches = height;
	}

	@Override
	public float getWeight() {
		System.out.println("getting Catcher's weight");
		return this.weight;
	}

	@Override
	public void setWeight(float weight) {
		System.out.println("setting Catcher's weight");
		this.weight = weight;
	}

	public float getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(float battingAverage) {
		this.battingAverage = battingAverage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see classes.BaseBallPlayer#warmTheBench()
	 */
	@Override
	public void warmTheBench() {

		System.out.println("Catcher is warming the bench!");
	}

}
