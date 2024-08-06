public class Program {

    public static void main(String[] args) {
        
        PizzaBuilder builder = new PizzaBuilder();
        PizzaType p1 = builder.buildPizza1();
        p1.showItems();

        PizzaType p2 = builder.buildPizza2();
        p2.showItems();

    }

}
