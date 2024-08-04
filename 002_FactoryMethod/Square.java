public class Square extends Shape{

    public Square(double side){
        super(side);
    }

    @Override
    public void draw() {
        System.out.println("Квадрат" + side);
        
    }

    @Override
    public double getArea() {
        return side * side;
    }

    
}
