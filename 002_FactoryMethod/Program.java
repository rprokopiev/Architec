import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите длинну");
        double size = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Название: Circle или Rectangle или Square");
        String name = scanner.nextLine();
        
        Creator creator = new Creator();
        creator.createShape(name, size);

        scanner.close();

    }
}
