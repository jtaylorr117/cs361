/**
 * 
 */
package circle;

/**
 * @author John Taylor
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ...
	 *         radius = ...
	 */
	@Override
	public String toString() {
		String output = "Circle: centerX = " + centerX + " CenterY = " + centerY + " radius = " + radius;
		return output;
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for centerX, centerY and
	 *         radius
	 */
	@Override
	public boolean equals(Object obj) {
		// creates local variables to check equivalence
		Circle objCircle = (Circle) obj;
		boolean value = false;

		if (this.centerX == objCircle.centerX && this.centerY == objCircle.centerY && this.radius == objCircle.radius)
			value = true;

		return value;
	}

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Circle newCircle = (Circle) super.clone();

		return newCircle;

	}

}
