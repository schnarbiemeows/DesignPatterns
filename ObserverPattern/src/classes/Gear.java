package classes;

import interfaces.Part;
import interfaces.Watch;

public class Gear implements Part {

	private Watch watch;
	private int partNum;
	
	public Gear(int partNum) {
		super();
		this.partNum = partNum;
	}

	@Override
	public void oil() {
		System.out.println("oiling gear # : " + partNum);

	}

	@Override
	public void setSubject(Watch watch) {
		this.watch = watch;
	}

}
