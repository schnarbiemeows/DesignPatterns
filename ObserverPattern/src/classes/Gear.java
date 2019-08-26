package classes;

import interfaces.Part;
import interfaces.Watch;

/**
 * @author dylan
 *
 */
public class Gear implements Part {

	private Watch watch;
	private int partNum;

	/**
	 * @param partNum
	 */
	public Gear(int partNum) {
		super();
		this.partNum = partNum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#oil()
	 */
	@Override
	public void oil() {
		System.out.println("oiling gear # : " + partNum);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Part#setSubject(interfaces.Watch)
	 */
	@Override
	public void setSubject(Watch watch) {
		this.watch = watch;
	}

}
