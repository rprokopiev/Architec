

public class Harvester extends Car implements Fueling, Wiping{

    private Refueling refueling;
    private Wiping wiping;

    public Harvester(String make, String model, String color) {
        super(make, model, color);
        setWeelsCount(6);
    }

    //region МОЙКА АВТО
    public void setWipingStation(Wiping wipingStation){
        this.wiping = wipingStation;
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Headlights have been wiped");        
    }

    @Override
    public void wipMirrors() {
        System.out.println("Mirrors have been wiped");
        
    }

    @Override
    public void wipWindshield() {
        System.out.println("Windshield has been wiped");
        
    }
    //endregion

    //region ЗАПРАВКА АВТО
    public void setRefuelingStation(Refueling refuelingStation){
        this.refueling = refuelingStation;
    }
    
    // to fuel auto
    @Override
    public void fuel() {
        System.out.println("Auto is fueling");
    }
    //endegion

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
    public boolean swithHeadLights() {
        return false;
        
    }

    @Override
    public boolean swithWipers() {
        return false;        
    }

    public void sweeping(){
        System.out.println("Sweeping on");
    }

}
