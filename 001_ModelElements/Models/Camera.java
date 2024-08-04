

public class Camera {

    private Angle3D angle;
    private Point3D location;

    public void rotate(double yaw, double pitch, double roll){
        angle.setYaw(angle.getYaw() + yaw);
        angle.setPitch(angle.getPitch() + pitch);
        angle.setRoll(angle.getRoll() + roll);
    }

    public void move(double x, double y, double z){
        location.setX(location.getX() + x);
        location.setY(location.getY() + y);
        location.setZ(location.getZ() + z);
    }

    public Camera(Angle3D angle, Point3D location) {
        this.angle = angle;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Camera [angle=" + angle + ", location=" + location + "]";
    }

    
}
