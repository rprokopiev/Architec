import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Creator implements BaseCreator {

    List <Square> squares = new ArrayList<>();
    List <Rectangle> rectangles = new ArrayList<>();
    List <Circle> circles = new ArrayList<>();

    @Override
    public void createShape(String shapeString, double side) {
        switch (shapeString) {
            case "Square":
                squares.add(new Square(side));
                System.out.println("Создан квадрат, со сторонами " + side);
                break;
            case "Rectangle":
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите длину второй стороны ");
                double side1 = Double.parseDouble(scan.nextLine());
                rectangles.add(new Rectangle(side, side1));
                System.out.println("Создан прямоугольник, со сторонами " + side + " и " + side1);
                break;
            case "Circle":
                circles.add(new Circle(side));
                System.out.println("Создан круг, с радиусом " + side);
                break;
            default:
                System.out.println("Такой фигуры нет");
                break;
        }
    }
    
}
