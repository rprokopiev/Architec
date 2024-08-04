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
            case "Rectangule":
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите длину второй стороны ");
                double side1 = Double.parseDouble(scan.nextLine());
                rectangles.add(new Rectangle(side, side1));
            case "Circle":
                circles.add(new Circle(side));
            default:
                System.out.println("Такой фигуры нет");
                break;
        }
    }
    
}
