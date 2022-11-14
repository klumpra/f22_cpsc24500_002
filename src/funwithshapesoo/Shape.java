package funwithshapesoo;
import java.io.Serializable;
import java.util.LinkedHashMap;
@SuppressWarnings("Unchecked")
public abstract class Shape implements Comparable<Shape>, Serializable  {
	// location of the shape in space
	private Point origin;    // ownership - object within another object
	public double getX() {
		return origin.getX();   // delegation - the owner asks the owned to do something so that it can do that thing.
	}
	public void setX(double x) {
		origin.setX(x);
	}
	public double getY() {
		return origin.getY();
	}
	public void setY(double y) {
		origin.setY(y);
	}
	public Shape() {
		origin = new Point();   // this creates the Point that reps the origin of this shape at (0,0) --> composition
	}
	public Shape(double x, double y) {
		origin = new Point(x,y);
	}
	public abstract String getShapeType();
	public abstract double findArea();
	public abstract double findPerim();
	@Override
	public String toString() {
		return String.format("%s\t%s", getShapeType(), origin);
	}
	@Override
	public int compareTo(Shape other) {
		double myArea = findArea();
		double otherArea = other.findArea();
		if (myArea < otherArea) {
			return -1;
		} else if (myArea > otherArea) {
			return 1;
		} else {
			return 0;
		}
	}
    public LinkedHashMap<String,String> mapValues() {
        LinkedHashMap<String,String> result = new LinkedHashMap<String,String>();
        result.put("shapetype", getShapeType());
        result.put("x", String.valueOf(getX()));
        result.put("y", String.valueOf(getY()));
        return result;
    }

}
