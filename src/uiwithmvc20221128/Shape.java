package uiwithmvc20221128;

public abstract class Shape {
    private int x;
    private int y;
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
    public Shape() {
        x = 0;
        y = 0;
    }
    public Shape(int x, int y) {
        setX(x);
        setY(y);
    }
    public abstract String getType();
    @Override
    public String toString() {
        return String.format("%s\t%d\t%d",getType(),x,y);
    }
}
