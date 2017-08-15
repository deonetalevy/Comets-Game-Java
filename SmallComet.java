package Comets;

import java.util.Vector;

public class SmallComet extends Comet {

	// Author: Deone'Ta Levy
	// Date: April 10, 2013
	// COP 3330
	// Comets
	// Class: SmallComet.java

	// Constructor
	public SmallComet(double xPos, double yPos, double xVel, double yVel) {
		// Radius should be 20
		super(xPos, yPos, xVel, yVel, smallCometRadius);
	}// End Constructor

	// explode Method: completely destroys comet
	public Vector<Comet> explode() {
		// Completely destroyed when hit
		Vector<Comet> smallExploded = new Vector<Comet>();
		return smallExploded;
	}// End explode Method
}// End SmallComet Class
