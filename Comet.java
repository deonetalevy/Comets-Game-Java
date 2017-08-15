package Comets;

public abstract class Comet extends SpaceObject {

	// Author: Deone'Ta Levy
	// Date: April 10, 2013
	// COP 3330
	// Comets
	// Class: Comet.java

	// Constructor
	public Comet(double xPos, double yPos, double xVel, double yVel,
			double radius) {

		super(xPos, yPos, xVel, yVel, radius);

	}// End Constructor

	// explode Method
	public abstract java.util.Vector<Comet> explode();

}
