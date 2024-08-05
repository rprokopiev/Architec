import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String pizzaName;
    private int diameter;
    private double price;
    private Dough dough;
    private Sauce sauce;
    private List<Topping> toppings;

    public PizzaBuilder(String pizzaName, int diameter, double price) {
        this.pizzaName = pizzaName;
        this.diameter = diameter;
        this.price = price;
        dough = new Dough();
        sauce = new Sauce();
        toppings = new ArrayList<>();
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void addToppings(Topping topping) {
        toppings.add(topping);
    }

    public Pizza buildPizza() {
        Pizza resultPizza = new Pizza(pizzaName, diameter, price, dough, sauce, toppings);
        return resultPizza;
    }

}
