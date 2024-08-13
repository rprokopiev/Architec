public class RefuelingStation implements Refueling{

    @Override
    public void fuel(FuelType fueltype) {
        switch (fueltype) {
            case Diesel:
                System.out.println("Disel fueling");
                break;
            case Gasoline:
                System.out.println("Gasoline fueling");
                break;
        }
        
    } 
}
