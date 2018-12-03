package classes;

public class OutFielder implements BaseBallPlayer {

	private int heightInInches;
	private float weight;
	private float battingAverage;
	
	public OutFielder(int heightInInches, float weight, float battingAverage) {
		super();
		this.heightInInches = heightInInches;
		this.weight = weight;
		this.battingAverage = battingAverage;
	}

	public OutFielder() {
		
	}

	@Override
	public int getHeightInInches() {
		System.out.println("getting Outfielder's height");
		return this.heightInInches;
	}

	@Override
	public void setHeightInInches(int height) {
		System.out.println("setting Outfielder's height");
		this.heightInInches = height;
	}

	@Override
	public float getWeight() {
		System.out.println("getting Outfielder's weight");
		return this.getWeight();
	}

	@Override
	public void setWeight(float weight) {
		System.out.println("setting Outfielder's weight");
		this.weight = weight;
	}

	public float getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(float battingAverage) {
		this.battingAverage = battingAverage;
	}

	@Override
	public void warmTheBench() {
		// TODO Auto-generated method stub
		System.out.println("Outfielder is warming the bench!");
	}
}
