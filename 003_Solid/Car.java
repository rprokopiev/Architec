
public abstract class Car {

    //region Constructors
    
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Car Color
    private String color;

    // Car Type
    protected CarType type;

    // Weels qty
    private int wheelsCount;

    // Fuel type
    protected FuelType fuelType;

    // Transmission type
    private GearboxType gearboxType;

    // Engine volume
    private double engineCapacity;

    // Fog lights state
    private boolean fogLights = false;

    //endregion

    //region Public Methods

    // Car movement
    public abstract void movement();

    // Car maintenance
    public abstract void maintenance();

    // Gear shifting
    public abstract boolean gearShifting();

    // Head lights on/off
    public abstract boolean swithHeadLights();

    // Wipers on/off
    public abstract boolean swithWipers();

    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWeelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    //endregion

}
