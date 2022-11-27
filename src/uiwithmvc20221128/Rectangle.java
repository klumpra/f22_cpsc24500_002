package uiwithmvc20221128;

public class Rectangle extends Shape {
    private int width;
    private int length;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public Rectangle() {
        this(0,0,0,0);
    }
    public Rectangle(int x, int y, int width, int length) {
        super(x,y);
        setWidth(width);
        setLength(length);
    }
    @Override
    public String getType() {
        return "rectangle";
    }
    @Override
    public String toString() {
        return String.format("%s\t%d\t%d", super.toString(),width,length);
    }
}
