package uiwithmvc20221128;

public class Circle extends Shape {
    public int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int rad) {
        if (rad < 0) {
            radius = 0;
        } else {
            radius = rad;
        }
    }
    public Circle() {
        this(0,0,0);
    }
    public Circle(int x, int y, int r) {
        super(x,y);
        setRadius(r);
    }
    @Override
    public String getType() {
        return "circle";
    }
    @Override
    public String toString() {
        return String.format("%s\t%d", super.toString(),radius);
    }
}
