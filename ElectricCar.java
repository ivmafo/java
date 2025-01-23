public class ElectricCar extends Car {
    public ElectricCar(String description) {
        super(description);
    }
    public double avgKmPerLitre() {
        return 20.0;
    };
    public int batterySize() {
        return 100;
    };
}
