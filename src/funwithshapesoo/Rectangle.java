package funwithshapesoo;

public class Rectangle extends Shape {
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double len) {
		if (len < 0) {
			length = 0;
		} else {
			length = len;
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double wid) {
		if (wid < 0) {
			width = 0;
		} else {
			width = wid;
		}
	}
	public Rectangle() {
		// origin auto set by def constructor of Shape
		length = 0;
		width = 0;
	}
	public Rectangle(double x, double y, double length, double width) {
		super(x,y); // inits the origin
		setLength(length);
		setWidth(width);
	}
	@Override
	public double findArea() {
		return length * width;
	}
	@Override
	public double findPerim() {
		return 2 * (length + width);
	}
	@Override
	public String getShapeType() {
		return "rect";
	}
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f", super.toString(),length,width);
	}
}
