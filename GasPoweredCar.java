public class GasPoweredCar extends Car {

    private double avgKmpPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmpPerLitre, int cylinders) {
        super(description);
        this.avgKmpPerLiter = avgKmpPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("GasPoweredCar ->  All %d cylinders ", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("GasPoweredCar -> runEngine usage exceds the average: %.2f %n ", avgKmpPerLiter);

    }
}
