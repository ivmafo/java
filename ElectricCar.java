public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmpPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmpPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV ->  switch %d kWh battery on, Ready!%n ", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n ", avgKmPerCharge);

    }
}
