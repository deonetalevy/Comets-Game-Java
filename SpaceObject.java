package Comets;

public abstract class SpaceObject {

	// Author: Deone'Ta Levy
	// Date: April 10, 2013
	// COP 3330
	// Comets
	// Class: SpaceObject.java

	// Fields
	public static double playfieldHeight;
	public static double playfieldWidth;
	protected double xVelocity;
	protected double yVelocity;
	protected double rad;
	protected double xPosition;
	protected double yPosition;

	// Constants
	static final double shotRadius = 3;
	static final double shotSpeed = 3;
	static final double largeCometRadius = 40.0;
	static final double mediumCometRadius = 30.0;
	static final double smallCometRadius = 20;
	static final double shipRadius = 10;
	static final double shipAcceleration = 0.1;
	static final double shipTurningRate = 0.1;
	static final double maximumShipSpeed = 10;

	// Constructor creating space objects
	public SpaceObject(double xPos, double yPos, double xVel, double yVel,
			double radius) {

		xVelocity = xVel;
		yVelocity = yVel;
		rad = radius;
		xPosition = xPos;
		yPosition = yPos;

	}// End constructor

	// getRadius Method: returns size of object
	public double getRadius() {
		return rad;
	}// End getRadius Method

	// getXPosition Method: returns x coordinate of object
	public double getXPosition() {
		return xPosition;
	}// End getXPosition Method

	// getYPosition Method: returns y coordinate of object
	public double getYPosition() {
		return yPosition;
	}// End getYPosition Method

	// move Method: Moves objects according to their velocities
	public void move() {

		// Keeps objects from exceeding 10 frames per second
		if ((xVelocity + yVelocity) > maximumShipSpeed) {
			xVelocity *= (maximumShipSpeed / (xVelocity + yVelocity));
			yVelocity *= (maximumShipSpeed / (xVelocity + yVelocity));
		}

		// Update object position on the canvas
		xPosition += xVelocity;
		yPosition += yVelocity;

		xPosition %= playfieldWidth;
		yPosition %= playfieldHeight;

		// Moves objects to opposite side if they hit the edge of the playArea
		if (xPosition < 0) {
			xPosition = playfieldWidth - 1;
		}

		if (yPosition < 0) {
			yPosition = playfieldHeight - 1;
		}
	}// End move Method

	// overlapping Method: Determines if objects are overlapping
	public boolean overlapping(SpaceObject obj) {

		if (this == null || obj == null)
			return false;

		// Equation provided to see if two objects are overlapping
		if (Math.sqrt(Math.pow((xPosition - obj.xPosition), 2)
				+ Math.pow(yPosition - obj.yPosition, 2)) < rad + obj.rad) {
			return true;
		}
		return false;
	}// End overlapping method
}// End SpaceObject Class

