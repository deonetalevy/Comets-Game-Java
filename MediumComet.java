package Comets;

import java.util.Vector;

public class MediumComet extends Comet {

	// Author: Deone'Ta Levy
	// Date: April 10, 2013
	// COP 3330
	// Comets
	// Class: MediumComet.java

	// Constructor
	public MediumComet(double xPos, double yPos, double xVel, double yVel) {
		// Radius should be 30
		super(xPos, yPos, xVel, yVel, mediumCometRadius);
	}// End Constructor

	// explode Method
	public Vector<Comet> explode() {
		// Break into three small comets
		Vector<Comet> smallComets = new Vector<Comet>();
		SmallComet newComet = null;
		int randNum;
		double xVel, yVel;
		for (int i = 0; i < 3; i++) {
			// Get random x and y velocities
			randNum = (int) (Math.random() * 4 + 1);

			xVel = Math.random() * 5;
			yVel = Math.random() * 5;

			// Use random number to determine position and velocities
			switch (randNum) {
			case 1:
				newComet = new SmallComet(xPosition, yPosition, xVel, yVel);
				break;
			case 2:
				newComet = new SmallComet(xPosition, yPosition, -xVel, yVel);
				break;
			case 3:
				newComet = new SmallComet(xPosition, yPosition, -xVel, -yVel);
				break;
			case 4:
				newComet = new SmallComet(xPosition, yPosition, xVel, -yVel);
				break;
			}// End Switch statement
			smallComets.add(newComet);
		}// End for loop
		return smallComets;// Return smallComets vector
	}// End explode Method
}// End MediumComet Class
