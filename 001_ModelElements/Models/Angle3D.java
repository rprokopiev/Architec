

public class Angle3D {

    /*
     * yaw - вертикальный угол
     * pitch - горизонтальный угол
     * roll - продольный угол
     */
    private double yaw, pitch, roll;

    public Angle3D(double yaw, double pitch, double roll) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Angle3D [yaw=" + yaw + ", pitch=" + pitch + ", roll=" + roll + "]";
    }

    // public static void main(String[] args) {
    //     Angle3D angle = new Angle3D(10, 20, 30);
    //     System.out.println(angle);
    // }

}
