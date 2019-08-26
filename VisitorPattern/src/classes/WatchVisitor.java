package classes;

import interfaces.PartVisitor;

/**
 * @author dylan
 *
 */
public class WatchVisitor implements PartVisitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.PartVisitor#visit(classes.Watch)
	 */
	@Override
	public void visit(Watch watch) {
		System.out.println("oiling watch.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.PartVisitor#visit(classes.Spring)
	 */
	@Override
	public void visit(Spring spring) {
		System.out.println("oiling spring.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.PartVisitor#visit(classes.Sprocket)
	 */
	@Override
	public void visit(Sprocket sprocket) {
		System.out.println("oiling sprocket.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.PartVisitor#visit(classes.Actuator)
	 */
	@Override
	public void visit(Actuator actuator) {
		System.out.println("oiling actuator.");
	}

}
