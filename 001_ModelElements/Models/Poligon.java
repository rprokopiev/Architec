import java.util.List;

public class Poligon {

    private List<Point3D> points;

    public Poligon(List<Point3D> points) {
        this.points = points;
    }

    public Poligon() {
    }

    public List<Point3D> getPoints() {
        return points;
    }

    public void setPoints(List<Point3D> points) {
        this.points = points;
    }
    
}
