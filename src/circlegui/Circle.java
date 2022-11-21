package circlegui;

public class Circle {
	private int x;
	private int y;
	private int radius;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}
	public Circle() {
		x = 0;
		y = 0;
		radius = 0;
	}
	public Circle(int x, int y, int radius) {
		setX(x);
		setY(y);
		setRadius(radius);
	}
	@Override
	public String toString() {
		return String.format("%d\t%d\t%d", x,y,radius);
	}
	
}
