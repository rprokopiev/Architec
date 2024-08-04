

public class Observer1 implements ModelChangeObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("New Poligonal Model has been added - Observer1");
        
    }
}
