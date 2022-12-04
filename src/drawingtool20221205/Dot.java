package drawingtool20221205;

public class Dot {
    private int x;
    private int y;
    private int size;
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
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        if (size < 1) {
            this.size = 1;
        } else {
            this.size = size;
        }
    }
    public Dot() {
        this(0,0,1);
    }
    public Dot(int x, int y, int size) {
        setX(x);
        setY(y);
        setSize(size);
    }
    @Override
    public String toString() {
        return String.format("%d\t%d\t%d", x,y,size);
    } 
}
