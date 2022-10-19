package funwithcircles20221019;

public class Circle {
	private double radius;
	private double x;    // center x coord
	private double y;    // center y coord
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}
	public Circle() {
		x = 0;
		y = 0;
		radius = 1;
	}
	// in your non-default constructors, use your set functions
	public Circle(double x, double y, double radius) {
		setX(x);
		setY(y);
		setRadius(radius);
	}
	public double findArea() {
		return Math.PI * radius * radius;
	}
	public double findCircumference() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {  // returns a String description of the circle
		return String.format("circle %.2f %.2f %.2f %.2f %2f", x, y, radius, 
				findArea(), findCircumference());
	}
}
