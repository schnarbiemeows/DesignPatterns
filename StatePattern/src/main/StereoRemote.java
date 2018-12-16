package main;

public class StereoRemote {

	private String state = "";

	public void setState(String state) {
		this.state = state;
	}

	public void doAction() {
		if (state.equalsIgnoreCase("ON")) {
			System.out.println("Stereo is turned ON");
		} else if (state.equalsIgnoreCase("OFF")) {
			System.out.println("Stereo is turned OFF");
		}
	}

	public static void main(String args[]) {
		StereoRemote remote = new StereoRemote();

		remote.setState("ON");
		remote.doAction();

		remote.setState("OFF");
		remote.doAction();
	}

}
