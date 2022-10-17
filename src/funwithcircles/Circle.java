package funwithcircles;

public class Circle {
	private double radius;
	public Circle() {
		radius = 0;
	}
	public Circle(double rad) {
		setRadius(rad);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double rad) {
		if (rad < 0) {
			radius = 0;
		} else {
			radius = rad;
		}		
	}
	public double findArea() {
		return Math.PI * radius * radius;
	}
	public double findCircumference() {
		return 2 * Math.PI * radius;
	}
}







