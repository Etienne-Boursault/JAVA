package heritage;

public class Carre extends FigureGeometrique {
    private long cote;

    public long getCote() {
        return cote;
    }

    public long getPerimeter() {
        return 4 * cote;
    }

    public Carre(int x, int y, long cote) {
        super(x, y);
        this.cote = cote;
    }
}
