package classes;

public class Pitcher implements BaseBallPlayer {

	private int heightInInches;
	private float weight;
	
	public Pitcher(int heightInInches, float weight) {
		super();
		this.heightInInches = heightInInches;
		this.weight = weight;
	}

	public Pitcher() {
		
	}

	@Override
	public int getHeightInInches() {
		System.out.println("getting Pitcher's height");
		return this.heightInInches;
	}

	@Override
	public void setHeightInInches(int height) {
		System.out.println("setting Pitcher's height");
		this.heightInInches = height;
	}

	@Override
	public float getWeight() {
		System.out.println("getting Pitcher's weight");
		return this.weight;
	}

	@Override
	public void setWeight(float weight) {
		System.out.println("setting Pitcher's weight");
		this.weight = weight;
	}

	@Override
	public void warmTheBench() {
		// TODO Auto-generated method stub
		System.out.println("Pitcher is warming the bench!");
	}

}
