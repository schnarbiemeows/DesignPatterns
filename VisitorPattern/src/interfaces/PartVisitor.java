package interfaces;

import classes.Actuator;
import classes.Spring;
import classes.Sprocket;
import classes.Watch;

public interface PartVisitor {

	public void visit(Watch watch);
	public void visit(Spring spring);
	public void visit(Sprocket sprocket);
	public void visit(Actuator actuator);
}
