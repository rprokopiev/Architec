public class Circle extends Shape {

    public Circle(double side){
        super(side);
    }

    @Override
    public void draw() {
        System.out.println("Круг с радиусом " + side); 
    }

    @Override
    public double getArea() {
        return Math.PI * side * side;
    }

}
