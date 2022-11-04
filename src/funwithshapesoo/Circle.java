package funwithshapesoo;

public class Circle extends Shape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		if (r < 0) {
			radius = 0;
		} else {
			radius = r;
		}
	}
	public Circle() {
		// default superclass constructor is called automatically here
		radius = 0;
	}
	public Circle(double x, double y, double r) {
		super(x,y);
		setRadius(r);
	}
	@Override
	public double findArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double findPerim() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String getShapeType() {
		return "circle";
	}
	@Override
	public String toString() {
		return String.format("%s\t%.2f",super.toString(),radius);
	}
}
