package Comets;

public class Ship extends SpaceObject {

	// Author: Deone'Ta Levy
	// Date: April 10, 2013
	// COP 3330
	// Comets
	// Class: Ship.java

	// Fields
	private double angle;

	// Constructor: Creates new ship
	public Ship(double xPos, double yPos, double xVel, double yVel) {
		// Radius is 10 and ships points at angle 0
		super(xPos, yPos, xVel, yVel, shipRadius);
		angle = 0;
	}// End Ship Constructor

	// accelerate Method: Move ship in the direction it is facing
	// Ship speed will not exceed 10 pixels per frame
	public void accelerate() {
		double deltaX, deltaY, speed;

		deltaX = (0.1) * Math.sin(angle); // change in X while accelerating
		deltaY = (0.1) * Math.cos(angle); // change in Y while accelerating

		xVelocity += deltaX;
		yVelocity += deltaY;

		// speed = Math.sqrt(Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2));
		speed = xVelocity + yVelocity;

		// sets a maximum velocity
		if (speed > maximumShipSpeed) {
			xVelocity *= (maximumShipSpeed / speed);
			yVelocity *= (maximumShipSpeed / speed);
		}

	}// End accelerate Method

	// fire Method: Creates a new shot
	public Shot fire() {
		// Comes from center of the ship
		// Shot velocity is 3 pixels per frame in the direction the ship is
		// pointing
		// plus the ship's current velocity
		Shot newShot = new Shot(xPosition, yPosition, xVelocity, yVelocity);

		// sets the direction and velocity for the newly created shot
		newShot.xVelocity += shotSpeed * Math.sin(angle);
		newShot.yVelocity += shotSpeed * Math.cos(angle);

		return newShot;
	}// End fire Method

	// getAngle Method
	public double getAngle() {
		return angle;
	}// End getAngle Method

	// rotateLeft Method: Increases the ship's angle
	public void rotateLeft() {
		angle += shipTurningRate;
	}// End rotateLeft Method

	// rotateRight Method: Decreases the ship's angle
	public void rotateRight() {
		angle -= shipTurningRate;
	}// End rotateRight Method
}// End Ship class
