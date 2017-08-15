package Comets;

public class Shot extends SpaceObject {

	// Author: Deone'Ta Levy
	// Date: April 10, 2013
	// COP 3330
	// Comets
	// Class: Shot.java

	// Fields
	private int age;

	// Constructor
	public Shot(double xPos, double yPos, double xVel, double yVel) {
		// Radius is 3 and new shots have age 0
		super(xPos, yPos, xVel, yVel, shotRadius);
		age = 0;
	}// End Constructor

	// getAge Method: Returns the age of a shot
	public int getAge() {
		// Age is the number of times move has been called on it
		return age;
	}// End getAge Method

	// move Method
	public void move() {
		super.move();
		age++;
	}// End move Method
}// End Shot Class
