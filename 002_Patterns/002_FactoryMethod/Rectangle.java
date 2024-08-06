public class Rectangle extends Shape{

    private double width;

    public Rectangle(double width, double height){
        super(width);
        side = height;
    }

    @Override
    public void draw() {
        System.out.println("Прямоугольник со сторонами" + width + ", " + side);
    }

    @Override
    public double getArea() {
        return width * side;
    }

}
