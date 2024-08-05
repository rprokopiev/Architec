

public abstract class Pizza {

    private String pizzaName;
    private int diameter;
    private double price;
    

    public Pizza(String pizzaName, int diameter, double price) {
        this.pizzaName = pizzaName;
        this.diameter = diameter;
        this.price = price;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }

    public String getPizzaName() {
        return pizzaName;
    }

}
