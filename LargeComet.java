package Comets;

import java.util.Vector;

public class LargeComet extends Comet {

	// Author: Deone'Ta Levy
	// Date: April 10, 2013
	// COP 3330
	// Comets
	// Class: LargeComet.java

	// Constructor
	public LargeComet(double xPos, double yPos, double xVel, double yVel) {

		super(xPos, yPos, xVel, yVel, largeCometRadius);

	}// End Constructor

	// explode Method
	public Vector<Comet> explode() {

		// Breaks LargeComet into two medium comets
		Vector<Comet> medComets = new Vector<Comet>();
		MediumComet newComet = null;
		int randNum;
		double x, y;
		for (int i = 0; i < 2; i++) {// Loop twice for two new comets
			// Get random x and y velocities
			randNum = (int) (Math.random() * 4 + 1);
			x = Math.random() * 5;
			y = Math.random() * 5;
			// Assigns position and velocities to a new MediumComet object
			switch (randNum) {
			case 1:
				newComet = new MediumComet(xPosition, yPosition, x, y);
			case 2:
				newComet = new MediumComet(xPosition, yPosition, -x, y);
			case 3:
				newComet = new MediumComet(xPosition, yPosition, -x, -y);
			case 4:
				newComet = new MediumComet(xPosition, yPosition, x, -y);
			}// End switch statement
			medComets.add(newComet);// Adds newComet to medComets vector
		}// End of for loop

		// Now return the medium comets
		return medComets;

	}// End explode Method
}// End LargeComet Class

