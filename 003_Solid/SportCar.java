public class SportCar extends Car {

    public SportCar(String make, String model, String color){
        super(make, model, color);
        setWeelsCount(3);
    }

    @Override
    public void movement() {
        // TODO Auto-generated method stub
    }

    @Override
    public void maintenance() {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean swithWipers() {
        return false;
    }
    
    @Override
    public boolean swithHeadLights() {
        return false;
    }

    
}
