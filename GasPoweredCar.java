public class GasPoweredCar extends Car {
    public GasPoweredCar(String description) {
        super(description);
    }

    public double avgKmPerLitre() {
        return 20.0;
    };
    public int cylinders() {
        return 4;
    };
}
