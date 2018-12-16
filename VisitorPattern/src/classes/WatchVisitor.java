package classes;

import interfaces.PartVisitor;

public class WatchVisitor implements PartVisitor {

	@Override
	public void visit(Watch watch) {
		System.out.println("oiling watch.");
	}

	@Override
	public void visit(Spring spring) {
		System.out.println("oiling spring.");
	}

	@Override
	public void visit(Sprocket sprocket) {
		System.out.println("oiling sprocket.");
	}

	@Override
	public void visit(Actuator actuator) {
		System.out.println("oiling actuator.");
	}

}
