import java.awt.Color;

public class Flash {

    private Angle3D angle;
    private Point3D location;
    private Color color;
    private float power;

    public Flash(Angle3D angle, Point3D location, Color color, float power) {
        this.angle = angle;
        this.location = location;
        this.color = color;
        this.power = power;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    

    



}
