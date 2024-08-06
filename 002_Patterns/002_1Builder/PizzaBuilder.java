public class PizzaBuilder {

    public PizzaType buildPizza1(){

        PizzaType p1 = new PizzaType();
        p1.addItem(new Pizza1());
        return p1;
    }


    public PizzaType buildPizza2(){

        PizzaType p2 = new PizzaType();
        p2.addItem(new Pizza2());
        return p2;
    }

}
