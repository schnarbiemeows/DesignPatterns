package classes;

import interfaces.Part;

public class PartMaker {

	private Part spring;
	private Part sprocket;
	private Part actuator;
	
	public PartMaker() {
		spring = new Spring();
		sprocket = new Sprocket();
		actuator = new Actuator();
	}
	
	public void assembleSpring() {
		spring.assemble();
	}
	
	public void assembleSprocket() {
		sprocket.assemble();
	}
	
	public void assembleActuator() {
		actuator.assemble();
	}
}
