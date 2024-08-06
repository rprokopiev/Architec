import java.util.ArrayList;
import java.util.List;

public class PizzaType {

    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packs){
        items.add(packs);
    }

    public void getCost(){
        for (Packing packs : items) {
            packs.price();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.println("Pizza name " + packing.pizzaName());
            System.out.println("Price: " + packing.price());
        }
    }

}
