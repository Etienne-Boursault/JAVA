package heritage;

public class FigureGeometrique {
    private int x;
    private int y;

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public FigureGeometrique(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
