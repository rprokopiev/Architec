public class FlyCar extends Car {

    public FlyCar(String make, String model, String color){
        super(make, model, color);
        setWeelsCount(4);
    }

    public void fly(){
        System.out.println("Car flies");
    }

    
    @Override
    public void maintenance() {
       
    }

    @Override
    public void movement() {
        fly();
    }


    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean swithHeadLights() {
        return false;
    }

    @Override
    public boolean swithWipers() {
        return false;
    }

    
}
