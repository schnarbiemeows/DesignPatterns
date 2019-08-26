package main;

/**
 * @author dylan
 *
 */
public class StereoRemote {

	private String state = "";

	/**
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 */
	public void doAction() {
		if (state.equalsIgnoreCase("ON")) {
			System.out.println("Stereo is turned ON");
		} else if (state.equalsIgnoreCase("OFF")) {
			System.out.println("Stereo is turned OFF");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		StereoRemote remote = new StereoRemote();

		remote.setState("ON");
		remote.doAction();

		remote.setState("OFF");
		remote.doAction();
	}

}
