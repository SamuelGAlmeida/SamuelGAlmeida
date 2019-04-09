package pp_fp07.bikestore;

/**
 *
 * @author Samuel Almeida
 */
public class BicycleManagment {

    private final Bicycle[] bikes;
    private final int NUMBER_OF_BIKES = 20;

    public BicycleManagment() {
        this.bikes = new Bicycle[NUMBER_OF_BIKES];
    }

    public Bicycle[] getBikes() {
        return bikes;
    }

    public void addBike(Bicycle[] bikes, Bicycle bike) {
        boolean flag = false;
        for (int i = 0; i < bikes.length; i++) {
            if (bikes[i] == null && flag == false) {
                bikes[i] = bike;
                flag = true;
            }
        }
    }

    public String BicycleManagementToString(Bicycle[] bikes) {
        for (Bicycle bicycles : bikes) {
            if (bicycles != null) {     
                bicycles.toString();
            }
        }
        return null;

    }
}
