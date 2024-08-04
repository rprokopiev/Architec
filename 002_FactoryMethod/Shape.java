
public abstract class Shape {

    // side of ractangule, square or radius of circle
    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    // method to draw 
    public abstract void draw();

    // method to find area
    public double getArea(){
        return 0;
    }
    
}


